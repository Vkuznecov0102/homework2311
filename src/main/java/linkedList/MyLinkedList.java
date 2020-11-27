package linkedList;

public class MyLinkedList {
    private Node head;

    public MyLinkedList() {
        head = null;
    }

    public int size() {
        Node currNode = head;
        int count = 0;
        if (currNode == null) {
            return 0;
        }
        while (currNode != null) {
            count++;
            currNode = currNode.getNext();
        }
        return count;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean contains(Object o) {
        Node current = head;

        boolean found = false;

        while (current != null && !found)
            if (o.equals(current.getValue()))
                found = true;
            else {
                current = current.getNext();
            }

        return found;
    }

    public boolean add(Object o) {
        Node resNode = new Node(o, null);

        if (head == null) {
            head = resNode;
        } else {
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(resNode);
        }
        return true;
    }

    public void add(int index, Object element) {
        checkIndex(index);
        Node curNode = head;
        Node prevNode = head;
        int count = 0;

        if (index == 0) {
            head = new Node(element, head);
            return;
        }
        while ((curNode = curNode.getNext()) != null) {
            count++;
            if (count == index) {
                break;
            }
            prevNode = prevNode.getNext();
        }
        prevNode.setNext(new Node(element, curNode));
    }

    public boolean remove(Object o) {

        if (head == null) return false;                //если головной элемент null,возвращаем false;
        if (head.getValue().equals(o)) {              //если значение первого объекта равно удаляемому
            head = head.getNext();                    //присваиваем ссылку, возвращаем true;
            return true;
        }
        if (head.getNext() == null) return false;      //если в головном элементе null,возвращаем false

        Node curNode = head;                          //создаем объект действуюшего элемента со стартовой позицией в головном
        Node prevNode = head;                         //создаем объект следующего элемента со стартовой позицией в головном

        while ((curNode = curNode.getNext()) != null) { //пока действующий элемент не null
            if (curNode.getValue().equals(o)) {       //если элемент равен удаляемому объекту останавливаемся
                break;
            }
            prevNode = prevNode.getNext();            //предыдущему элементу дается ссылка на следующий
        }
        if (curNode == null) return false;             //если действующий элемент null возвращаем false

        prevNode.setNext(curNode.getNext()); //удаляем элемент путем ссылки на следующий
        curNode.setNext(null);              //устанавливаем действующий элемент в null

        return true;                        //возвращаем true
    }

    public void clear() {
        head = null;
    }

    public Object get(int index) {
        checkIndex(index);
        Node curNode = head;
        int count = 0;
        while (count != index) {
            curNode = curNode.getNext();
            count++;
        }
        return curNode.getValue();
    }

    public Object set(int index, Object element) {
        checkIndex(index);
        Node curNode = head;

        int count = 0;
        while (count != index) {
            curNode = curNode.getNext();
            count++;
        }
        curNode.setValue(element);
        return curNode.getValue();
    }


    public Object remove(int index) {
        checkIndex(index);                                  //проверяем корректен ли индекс
        if (index == 0) {                                       //если индекс равен нулю
            Object resValue = head.getValue();                //создаем объект равный значению нулевого элемента
            if (head.getNext() == null) {                       //если следующий элемент null
                head = null;                                  //то и нулевой null
            } else {                                          //или
                head = head.getNext();                      //получаем значение следующего элемента
            }
            return resValue;                                //возвращаем объект нулевого элемента
        }
        Node curNode = head;                                  //создаем ссылку на текущий элемент и приравниваем к основному
        Node prevNode = head;                                 //создаем ссылку на предыдущий элемент и приравниваем к основному
        int count = 0;                                        //создаем счетчик
        while ((curNode = curNode.getNext()) != null) {         // пока список не заканчивается
            count++;                                        //увеличиваем счетчик
            if (count == index) {                               //если счетчик равен индексу
                break;                                      //останавливаемся
            }
            prevNode = prevNode.getNext();                    //ссылка на предыдущий элемент равна следующему
        }
        Object resValue = curNode.getValue();                 //создаем объект и кладем в него значение текущего элемента

        if (curNode.getNext() == null) {                      //если элемент null
            prevNode.setNext(null);                         //устанавливаем предыдущему значение null
        } else {                                               //или
            prevNode.setNext(curNode.getNext());            //предыдущему элементу ставим значение следующего
            curNode.setNext(null);                          //текущему элементу ставим значение null
        }
        return resValue;                                    //возвращаем объект
    }

    private void checkIndex(int index) {
        if (!isCorrectIndex(index)) {
            throw new ArrayIndexOutOfBoundsException("Некорректен индекс");
        }
    }

    private boolean isCorrectIndex(int index) {
        if ((index > -1) || (index < size())) return true;
        return false;
    }

    public int indexOf(Object o) {

        int index = 0;
        Node curNode = head;

        while (curNode != null) {
            if (curNode.getValue().equals(o)) {
                return index;
            }
            index++;
            curNode = curNode.getNext();
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        int index = 0;
        int found = -1;
        Node current = head;
        while (current != null) {
            if (current.getValue().equals(o)) {
                found = index;
            }
            index++;
            current = current.getNext();
        }
        return found;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}

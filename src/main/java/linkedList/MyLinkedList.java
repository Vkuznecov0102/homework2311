package linkedList;

public class MyLinkedList {
    private Node head;
    private int realSize;

    public MyLinkedList() {
        head = null;
        realSize = 0;
    }

    public int size() {
        Node currNode = head;
        if (currNode == null) return 0;
        while (currNode != null) {
            realSize++;
            currNode = currNode.getNext();
        }
        return realSize;
    }

    public boolean isEmpty() {
        return realSize == 0;
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

    public boolean remove(Object o) {
        return false;
    }

    public void clear() {

    }

    public Object get(int index) {
        return null;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}

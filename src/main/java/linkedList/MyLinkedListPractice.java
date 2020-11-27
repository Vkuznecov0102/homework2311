package linkedList;

public class MyLinkedListPractice {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        System.out.println("list.size() = " + list.size());
        System.out.println("list.isEmpty() = " + list.isEmpty());

        list.add("Это первый объект");
        list.add("Это второй объект");
        list.add("Это третий объект");

        System.out.println(list);

        System.out.println("list.size() = " + list.size());
        System.out.println("list.isEmpty() = " + list.isEmpty());
        System.out.println("list.contains(\"Это первый объект\") = " + list.contains("Это первый объект"));
        System.out.println("list.contains(\"Это четвертый объект\") = " + list.contains("Это четвертый объект"));
        System.out.println("list.size() = " + list.size());

        list.add("Это пятый объект");
        list.add("Это шестой объект");
        list.add("Это седьмой объект");
        System.out.println("list.size() = " + list.size());

        list.remove(1);
        System.out.println(list);

        System.out.println("list.get(3) = " + list.get(3));

        list.set(0, "Это результат метода set");
        System.out.println(list);
        System.out.println("list.size() = " + list.size());

        list.add("Это еще один элемент");
        list.add("Это свежий элемент");
        list.add("Это холодный элемент");
        System.out.println(list);

        list.remove("Это пятый объект");
        System.out.println(list);

        System.out.println("list.indexOf(\"Это результат метода set\") = " + list.indexOf("Это результат метода set"));

        list.add("Это третий объект");
        System.out.println("list.lastIndexOf(\"Это еще один элемент\") = " + list.lastIndexOf("Это еще один элемент"));
        System.out.println("list.lastIndexOf(\"Это третий объект\") = " + list.lastIndexOf("Это третий объект"));

        list.add(1,"Объект метода add");
        System.out.println(list);

       list.clear();
       System.out.println(list);
       System.out.println("list.size() = " + list.size());
    }
}

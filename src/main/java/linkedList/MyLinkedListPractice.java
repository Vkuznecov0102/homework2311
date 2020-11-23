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
    }
}

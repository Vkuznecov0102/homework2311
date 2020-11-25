package linkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MyLinkedListTest {

    public static final String STR_FIRST = "Test object 1";
    public static final String STR_SECOND = "Test object 2";
    public static final String STR_THIRD = "Test object 3";
    public static final String STR_FOURTH = "Test object 4";
    public static final String STR_FIFTH = "Test object 5";
    public static final String SET_STRING = "Test object 666";
    public static final int EMPTY_SIZE = 0;
    public static final String TO_STRING = "MyLinkedList{head=Node(value=Test object 1, next=Node(value=Test object 2, next=null))}";


    @Test
    @DisplayName("корректно показывать размер списка: ")
    public void sizeTest() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(STR_FIRST);
        myLinkedList.add(STR_SECOND);
        Assertions.assertEquals(2, myLinkedList.size());
    }

    @Test
    @DisplayName("корректно добавлять объект ")
    public void objectAddTest() {
        MyLinkedList expected = new MyLinkedList();
        Assertions.assertEquals(expected.size(), EMPTY_SIZE);
        expected.add(STR_SECOND);
        expected.add(STR_FIRST);

        Assertions.assertTrue(expected.contains(STR_SECOND));
        Assertions.assertTrue(expected.contains(STR_FIRST));
    }

    @Test
    @DisplayName("корректно удалять объект ")
    public void objectRemoveTest() {
        MyLinkedList expected = new MyLinkedList();
        expected.add(STR_SECOND);
        expected.add(STR_FIRST);
        expected.add(STR_THIRD);
        expected.remove(STR_FIRST);

        Assertions.assertEquals(2, expected.size());
        Assertions.assertFalse(expected.contains(STR_FIRST));
    }

    @Test
    @DisplayName("проверять пуст ли список ")
    public void isEmptyTest() {
        MyLinkedList expected = new MyLinkedList();
        Assertions.assertTrue(expected.isEmpty());
        expected.add(STR_THIRD);
        Assertions.assertFalse(expected.isEmpty());
    }

    @Test
    @DisplayName("проверять содержит ли список элемент ")
    public void containsTest() {
        MyLinkedList expected = new MyLinkedList();
        expected.add(STR_FIRST);
        expected.add(STR_THIRD);

        Assertions.assertTrue(expected.contains("Test object 1"));
        Assertions.assertTrue(expected.contains(STR_THIRD));
        Assertions.assertFalse(expected.contains(STR_SECOND));
    }

    @Test
    @DisplayName("корректно очищать список ")
    public void clearingTest() {
        MyLinkedList expected = new MyLinkedList();
        expected.add(STR_SECOND);
        expected.add(STR_FIRST);
        expected.add(STR_THIRD);
        expected.clear();
        Assertions.assertEquals("MyLinkedList{head=null}", expected.toString());
    }

    @Test
    @DisplayName("корректно удалять элемент по индексу ")
    public void indexRemoveTest() {
        MyLinkedList expected = new MyLinkedList();
        expected.add(STR_SECOND);
        expected.add(STR_FIRST);
        expected.add(STR_THIRD);
        expected.add(STR_FOURTH);
        expected.add(STR_FIFTH);
        expected.remove(1);

        Assertions.assertFalse(expected.contains(STR_FIRST));
        Assertions.assertNotEquals(expected.get(1), STR_FIRST);
    }

    @Test
    @DisplayName("получать элемент по индексу ")
    public void getIndexTest() {
        MyLinkedList expected = new MyLinkedList();
        expected.add(STR_SECOND);
        expected.add(STR_FIRST);
        expected.add(STR_THIRD);

        Assertions.assertEquals(expected.get(0), STR_SECOND);
        Assertions.assertEquals(expected.get(1), STR_FIRST);
        Assertions.assertEquals(expected.get(2), STR_THIRD);
    }

    @Test
    @DisplayName("считать первое вхождение элемента в список ")
    public void indexOfTest() {
        MyLinkedList expected = new MyLinkedList();
        expected.add(STR_SECOND);
        expected.add(STR_FIRST);
        expected.add(STR_FIRST);
        expected.add(STR_THIRD);

        Assertions.assertEquals(expected.indexOf(STR_FIRST), 1);
        Assertions.assertEquals(expected.indexOf(STR_THIRD), 3);
        Assertions.assertEquals(expected.indexOf(new Object()), -1);
    }

//        @Test
//        @DisplayName("считать последнее вхождение элемента в список ")
//        public void lastIndexOfTest() {
//            MyLinkedList expected = new MyLinkedList();
//            expected.add(STR_SECOND);
//            expected.add(STR_FIRST);
//            expected.add(STR_FIRST);
//            expected.add(STR_THIRD);
//
////            Assertions.assertEquals(expected.lastIndexOf("STR_FIRST"), 2); //должно быть 2
////            Assertions.assertEquals(expected.lastIndexOf(STR_SECOND), -1); //считает что элемент отсутствует
////            Assertions.assertEquals(expected.lastIndexOf(TO_STRING), -1); //работает
//
//        }

    @Test
    @DisplayName("корректно модифицировать элементы списка ")
    public void setTest() {
        MyLinkedList expected = new MyLinkedList();
        expected.add(STR_FIRST);
        expected.add(STR_SECOND);
        expected.add(STR_THIRD);
        expected.set(1, SET_STRING);

        Assertions.assertNotEquals(STR_SECOND, expected.get(1));
        Assertions.assertEquals(expected.get(1), SET_STRING);
    }

//        @Test
//        @DisplayName("добавлять элемент по индексу ")
//        public void addWithIndexTest() {
//            CustomArrayList expected = new CustomArrayList();
//            Assertions.assertEquals(expected.size(), EMPTY_SIZE);
//            expected.add(STR_FIRST);
//            expected.add(STR_SECOND);
//            expected.add(STR_FIRST);
//            expected.add(3, STR_FOURTH);
//            expected.add(4, STR_FIFTH);
//
//            Assertions.assertEquals(expected.get(0), STR_FIRST);
//            Assertions.assertEquals(expected.get(4), STR_FIFTH);
//
//            expected.add(0, TO_STRING);
//
//            Assertions.assertNotEquals(expected.get(0), STR_FIRST);
//            Assertions.assertEquals(expected.size(), 6);
//        }

    @Test
    @DisplayName("корректно выводить список в виде строки ")
    public void toStringTest() {
        MyLinkedList expected = new MyLinkedList();
        expected.add(STR_FIRST);
        expected.add(STR_SECOND);
        Assertions.assertEquals(expected.toString(), TO_STRING);
    }
}

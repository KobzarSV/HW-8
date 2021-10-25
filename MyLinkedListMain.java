package ua.goit.HomeWork8;

public class MyLinkedListMain {
    public static void main(String[] args) {
        MyLinkedList<String> names = new MyLinkedList<>();

        names.add("Oleg");
        names.add("Sergey");
        names.add("Dmitriy");
        names.add("Evgen");
        names.add("Victor");
        names.add("Alex");

        System.out.println("My LinkedList: ");
        MyLinkedList.printList(names);

        names.remove(4);

        System.out.println("After remove name: ");
        MyLinkedList.printList(names);

        System.out.println("The name at index 1: " + names.get(1));

        System.out.println("My LinkedList size: " + names.size());

        names.clear();
        System.out.println("My LinkedList size after clear: " + names.size());
    }
}

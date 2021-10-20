package ua.goit.HomeWork8;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();

        names.add("Oleg");
        names.add("Sergey");
        names.add("Dmitriy");
        names.add("Evgen");
        names.add("Victor");
        names.add("Alex");

        System.out.println(names);

        System.out.println("My LinkedList: ");
        for (String name : names) {
            System.out.println(name);
        }

        names.remove("Victor");
        names.remove(4);
        names.add(4, "Alexey");

        System.out.println("After add and remove names: ");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("The name at index 1: " + names.get(1));

        System.out.println("My LinkedList size: " + names.size());

        names.clear();
        System.out.println("My LinkedList size after clear: " + names.size());
    }
}

package ua.goit.HomeWork8;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
        Queue<String> cars = new LinkedList<>();

        cars.add("Honda");
        cars.add("Toyota");
        cars.add("Mazda");
        cars.offer("BMW");
        cars.offer("Mercedes");

        System.out.println("My Queue: " + cars);

        System.out.println("My Queue size: " + cars.size());

        System.out.println("First element: " + cars.peek());

        cars.remove("Mazda");
        System.out.println("After remove Mazda: " + cars);

        String poll = cars.poll();
        System.out.println("Remove: " + poll + ". After remove: " + cars);

        cars.clear();
        System.out.println(cars);
    }
}

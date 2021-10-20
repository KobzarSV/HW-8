package ua.goit.HomeWork8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{11, 12, 13, 14, 15, 16};

        List<Integer> numbers = new ArrayList<>(Arrays.asList(integers));

        System.out.println("My ArrayList: ");
        for (Integer nums : numbers) {
            System.out.println(nums);
        }

        numbers.add(17);
        numbers.add(3, 20);
        numbers.remove(2);

        System.out.println("After add and remove items: ");
        for (Integer nums : numbers) {
            System.out.println(nums);
        }

        System.out.println("The value at index 2: " + numbers.get(2));

        System.out.println("My ArrayList size: " + numbers.size());

        numbers.clear();
        System.out.println("My ArrayList size: " + numbers.size());
    }
}

package ua.goit.HomeWork8;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<String> numbers = new Stack<>();

        numbers.push("one");
        numbers.push("two");
        numbers.push("three");
        numbers.push("four");
        numbers.push("five");
        numbers.push("six");

        System.out.println("Stack: " + numbers);

        System.out.println("Stack size: " + numbers.size());

        System.out.println("Last element Stack: " + numbers.peek());

        System.out.println("Last element Stack and remove him: " + numbers.pop());

        numbers.remove(2);
        System.out.println("Stack after remove: " + numbers);

        numbers.clear();
        System.out.println(numbers);
    }
}

package ua.goit.HomeWork8;

public class MyStackMain {
    public static void main(String[] args) {
        MyStack<Integer> numbers = new MyStack<>(6);

        numbers.push(1);
        numbers.push(2);
        numbers.push(3);
        numbers.push(4);
        numbers.push(5);
        numbers.push(6);

        System.out.println("Stack: ");
        numbers.print();

        System.out.println("Stack size: " + numbers.size());

        System.out.println("Last element Stack: " + numbers.peek());

        System.out.println("Last element Stack and remove him: " + numbers.pop());

        numbers.remove();

        System.out.println("Stack after remove: ");
        numbers.print();

        numbers.clear();
        numbers.print();
    }
}

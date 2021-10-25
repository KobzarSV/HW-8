package ua.goit.HomeWork8;

public class MyQueueMain {
    public static void main(String[] args) {
        MyQueue number = new MyQueue(10);

        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(6);

        System.out.println("My Queue: ");
        number.print();

        System.out.println("My Queue size: " + number.size());

        System.out.println("First element: " + number.peek());

        number.remove();
        System.out.println("After remove ");
        number.print();

        int poll = number.poll();
        System.out.println("Remove: " + poll + ". After remove: ");
        number.print();

        number.clear();
        number.print();
    }
}

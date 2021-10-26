package ua.goit.HomeWork8;

public class MyArrayListMain {
    public static void main(String[] args) {

        MyArrayList numbers = new MyArrayList();
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        numbers.add(16);
        numbers.add(17);
        numbers.add(18);
        numbers.add(19);
        numbers.add(20);
        numbers.add(21);

        System.out.println("My ArrayList: ");
        MyArrayList.printList(numbers);

        numbers.remove(2);
        System.out.println("After remove items: " );
        MyArrayList.printList(numbers);

        System.out.println("The value at index 2: " + numbers.get(2));

        System.out.println("My ArrayList size: " + numbers.size());

        numbers.clear();
        System.out.println("My ArrayList size: " + numbers.size());
    }
}

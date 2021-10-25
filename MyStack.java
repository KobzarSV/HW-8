package ua.goit.HomeWork8;

public class MyStack<T> {

    private int size;
    private int[] array;
    private int top;

    public MyStack(int size) {
        this.size = size;
        this.array = new int[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public void push(int element) {
        int i = ++top;
        array[i] = element;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("My Stack is empty");
            return 0;
        } else {
            size--;
            return array[top--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("My Stack is empty");
            return 0;
        } else {
            return array[top];
        }
    }

    public int remove() {
        return array[top--];
    }

    public int size() {
        return size;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = 0;
        }
        size = 0;
    }

    public void print() {
        System.out.print("[");
        int item = top;
        for (int i = 0; i < size; i++) {
            System.out.print(array[item++ % size]);
            if (i != size - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}

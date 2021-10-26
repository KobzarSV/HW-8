package ua.goit.HomeWork8;

public class MyQueue {

    private int[] array;
    private int size;
    private int count;
    private int head;
    private int tail;

    public MyQueue(int maxSize) {
        this.size = maxSize;
        array = new int[size];
        head = 0;
        count = 0;
        tail = -1;
    }

    public void add(int value) throws Exception {
        if (isFull()) {
            throw new Exception("My Queue is full");
        }
        if (tail == size - 1) {
            tail = -1;
        }
        array[++tail] = value;
        count++;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("My Queue is empty");
            return 0;
        }
        count--;
        head = head % size;
        return array[head++];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("My Queue is empty");
            return 0;
        }
        return array[head];
    }

    public int size() {
        return count;
    }

    public void print() {
        System.out.print("[");
        int item = head;
        for (int i = 0; i < count; i++) {
            System.out.print(array[item++ % size]);
            if (i != count - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    public boolean isFull() {
        return (count == size);
    }

    public boolean isEmpty() {
        return (count == 0);
    }

    public int poll() {
        count--;
        head = head % size;
        return array[head++];
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            count--;
            head = head % size;
        }
        size = 0;
    }
}

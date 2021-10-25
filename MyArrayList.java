package ua.goit.HomeWork8;

import java.util.Objects;

public class MyArrayList {

    private static final int DEFAULT_CAPACITY = 10;
    private final Object[] array = new Object[DEFAULT_CAPACITY];
    private int size = 0;

    public void add(Object value) {
        if (size == array.length - 1) {
            int resize = array.length * 2;
        }
        array[size++] = value;
    }

    public Object get(int index) {
        Objects.checkIndex(index, size);
        return (Object) array[index];
    }

    public void remove(int index) {
        for (int i = index; i < size; i++)
            array[i] = array[i + 1];
        array[size] = null;
        size--;
    }

    public int size() {
        return size;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    public static void printList(MyArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

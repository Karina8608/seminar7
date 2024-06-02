package Seminar_7_generic;

import java.util.AbstractList;
import java.util.Arrays;

public class ListA<T> extends AbstractList<T> {
    private Object[] elements;
    private int size;

    public ListA() {
        elements = new Object[10];
        size = 0;
    }

    @Override
    public boolean add(T e) {
        ensureCapacity(size + 1);
        elements[size++] = e;
        return true;
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        T removedElement = (T) elements[index];
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = null;
        return removedElement;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        return (T) elements[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elements, size));
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = Math.max(elements.length * 2, minCapacity);
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    public static void main(String[] args) {
        ListA<String> myList = new ListA<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

        System.out.println("Contents: " + myList);
        System.out.println("Element at index 1: " + myList.get(1));
        System.out.println("Removed element at index 0: " + myList.remove(0));
        System.out.println("All contents: " + myList);
    }
}


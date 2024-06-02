package Seminar_7_generic;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class ListB<T> extends AbstractList<T> {
    private List<T> elements;

    public ListB() {
        elements = new ArrayList<>();
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean add(T e) {
        return elements.add(e);
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= elements.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        return elements.remove(index);
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= elements.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        return elements.get(index);
    }

    @Override
    public T set(int index, T e) {
        if (index < 0 || index >= elements.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        return elements.set(index, e);
    }

    @Override
    public void add(int index, T e) {
        if (index < 0 || index > elements.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        elements.add(index, e);
    }

    @Override
    public String toString() {
        return elements.toString();
    }

    public static void main(String[] args) {
        ListB<String> myList = new ListB<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

        System.out.println("Contents: " + myList);
        System.out.println("Element at index 1: " + myList.get(1));
        myList.set(0, "Pear");
        System.out.println("Updated contents: " + myList);

        List<String> additionalFruits = new ArrayList<>();
        additionalFruits.add("Grapes");
        additionalFruits.add("Cherry");
        myList.addAll(additionalFruits);
        System.out.println("All fruits: " + myList);
    }
}


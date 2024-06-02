package Seminar_7_generic;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class SetC<T> extends AbstractSet<T> {
    private HashSet<T> elements;

    public SetC() {
        elements = new HashSet<>();
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public boolean add(T e) {
        return elements.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return elements.remove(o);
    }

    @Override
    public boolean contains(Object o) {
        return elements.contains(o);
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return elements.addAll(c);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return elements.containsAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return elements.removeAll(c);
    }

    @Override
    public String toString() {
        return elements.toString();
    }

    public static void main(String[] args) {
        SetC<String> mySet = new SetC<>();
        mySet.add("Apple");
        mySet.add("Banana");
        mySet.add("Orange");

        System.out.println("All contents: " + mySet);
        System.out.println("Size: " + mySet.size());
        System.out.println("Empty? " + mySet.isEmpty());

        HashSet<String> additionalFruits = new HashSet<>();
        additionalFruits.add("Grapes");
        additionalFruits.add("Cherry");
        mySet.addAll(additionalFruits);

        System.out.println("All fruits: " + mySet);
    }
}


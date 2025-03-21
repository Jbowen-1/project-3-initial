package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;


//AI PROMPT: Write a generic class called Bag that implements the Container interface.
//The Bag implementation must use an ArrayList, the Container Interface cannot be changed,
//and add a test class to test the code.


public class Bag<T> implements Container<T> {
    private List<T> items;

    public Bag() {
        items = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public void add(T item) {
        items.add(item);
    }

    @Override
    public Iterator<T> iterator() {
        return items.iterator();
    }

    @Override
    public Spliterator<T> spliterator() {
        return items.spliterator();
    }
}
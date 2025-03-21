package com.example.iterable;

import java.util.Iterator;
import java.util.Spliterator;

public class BagTest {

    public static void main(String[] args) {

        Bag<String> bag = new Bag<>();

        bag.add("\tApple");
        bag.add("\tBanana");
        bag.add("\tCherry");
        bag.add("\tOrange");
        bag.add("\tGrape");

        Iterator<String> iterator = bag.iterator();

        System.out.println("Bag size: " + bag.size());
        System.out.println("Items in the bag:");

        iterator.forEachRemaining(System.out::println);

        System.out.println("Is bag empty? " + bag.isEmpty());

        Spliterator <String> spliterator = bag.spliterator();
        System.out.println("Items in the bag (using spliterator):");
        spliterator.forEachRemaining(System.out::println);


    }

}
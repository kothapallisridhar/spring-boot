package com.kothapalli.javacollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class IteratorExercise {

    public static void main(String[] args) {

        FruitSupplier fruitSupplier = new FruitSupplier();
        Collection<String> fruits = fruitSupplier.getFruits();
        Iterator<String> iterator = fruits.iterator();

        while(iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println("fruit: " + fruit);
        }

        // another way using enhanced for loop
        for(String fruit: fruits) {
            System.out.println("fruit: " + fruit);
        }
    }

}

class FruitSupplier {
    public Collection<String> getFruits() {

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grape");
        return fruits;
    }
}

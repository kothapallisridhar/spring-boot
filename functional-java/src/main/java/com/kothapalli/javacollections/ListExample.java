package com.kothapalli.javacollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Pear");
        fruits.add("Watermelon");
        System.out.println("Fruits: " + fruits);

        List<String> fruits1 = Arrays.asList("Apple", "Banana", "Orange", "Pear");
        System.out.println("Fruits1: " + fruits1);

        List<String> fruits2 = List.of("Apple", "Banana", "Orange", "Pear");
        System.out.println("Fruits2: " + fruits2);

        List<String> fruits3 = new ArrayList<>(fruits);
        System.out.println("Fruits3: " + fruits3);

    }
}

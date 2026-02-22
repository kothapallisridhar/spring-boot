package com.kothapalli.functionaljava;

import java.util.function.Function;

public class ComposableFunctions {

    public static void main(String[] args) {
        Function<Integer, Integer> increment = x -> x + 1;
        Function<Integer, Integer> doubleIt = x -> x * 1;

        Function<Integer, Integer> combine =
                increment.andThen(doubleIt).andThen(increment).andThen(doubleIt);

        System.out.println(combine.apply(10));

        String name = " Kothapalli ";
        Function<String, String> stripLeading = String::stripLeading;
        Function<String, String> stripTailing = String::stripTrailing;
        Function<String, String> capitalize = String::toUpperCase;

        String processedName = stripLeading
                .andThen(stripTailing)
                .andThen(capitalize)
                .apply(name);
        System.out.println(processedName);

    }
}

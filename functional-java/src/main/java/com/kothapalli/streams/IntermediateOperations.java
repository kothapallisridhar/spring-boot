package com.kothapalli.streams;

import java.util.stream.Stream;

public class IntermediateOperations {

    public static void main(String[] args) {

        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> limitedStream = numbers.limit(5);
        limitedStream.forEach(System.out::println);

        System.out.println("*************");
        numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.filter(i -> i % 2 == 0).limit(2).forEach(System.out::println);

        Stream<String> fruitsStream = Stream.of("apple", "banana", "mango", "grape", "orange", "strawberry");
        fruitsStream
                .map(String::toUpperCase)
                .peek(str -> System.out.println("Peek result: " + str))  // to do any kind of a side effect like printing / peek the result/ peek is used to examine something
                .filter(name -> name.length() < 6)
                .forEach(System.out::println);

        numbers = Stream.of(3,4, 5, 5, 6, 9, 8, 7, 8, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers
                .distinct() // removes duplicates
                .sorted() // sort in ascending order
                .forEach(System.out::println);





    }
}

package com.kothapalli.streams;

import java.util.List;
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

        Stream<Integer> oddNumbers = Stream.of(1, 3, 5, 7, 9);
        Stream<Integer> evenNumbers = Stream.of(2, 4, 6, 8, 10);
        Stream.concat(oddNumbers, evenNumbers).forEach(System.out::println);

        Stream<Watch> watchStream = Stream.of(
                new Watch("Rolex", 5500000),
                new Watch("Patek Philippe", 16600000),
                new Watch("Tissot", 100000),
                new Watch("Omega", 1000000),
                new Watch("Tag Heuer", 120000),
                new Watch("Grand Seiko", 200000),
                new Watch("Hublot", 8800000)
        );

        List<String> watchList = watchStream
                .filter(w -> w.getPrice() > 200000)
                .map(Watch::getName)
                .toList();
        System.out.println("Watches list: " + watchList);
    }
}
class Watch {
    String name;
    Integer price;

    public Watch(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
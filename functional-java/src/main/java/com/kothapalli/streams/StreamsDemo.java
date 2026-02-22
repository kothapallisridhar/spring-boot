package com.kothapalli.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {

    public static void main(String[] args) throws IOException {

        List<String> list = List.of("foo", "bar", "car");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);

        int[] numbers = {1, 2, 3, 4, 5};
        Arrays.stream(numbers).forEach(System.out::println);

        Stream.of("mango", "banana", "apple", "orange").forEach(System.out::println);

        Stream<String> lines = Files.lines(Paths.get("README.md"));
        lines.forEach(System.out::println);

        Stream.generate(Math::random)
                .limit(10)
                .forEach(System.out::println);

        Stream.iterate(0, i -> i + 1)
                .limit(10)
                .forEach(System.out::println);

        List<Integer> uptoHundred = Stream.iterate(0, x -> x + 1)
                .limit(100)
                .toList();
        System.out.println(uptoHundred);

    }
}

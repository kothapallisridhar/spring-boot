import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) throws IOException {

        List<String> names = List.of("John", "Jane", "Bob");
        Stream<String> namesStream = names.stream();
        //Consumer<String> print = System.out::println;
        namesStream.forEach(System.out::println);

        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Arrays.stream(numbers).forEach(System.out::println);

        Stream.of("mango", "banana", "grapes", "orange").forEach(System.out::println);
        // every stream would only be used once

        // Using built in APIs that return Stream
        Stream<String> lines = Files.lines(Paths.get("README.md"));
        lines.forEach(System.out::println);

        Stream.generate(new Random()::nextDouble)
                .limit(10)
                .forEach(System.out::println);

        Stream.iterate(2, i -> i + 2).limit(10).forEach(System.out::println);

        List<Integer> upToHundred = Stream.iterate(0, x -> x + 1)
                .limit(100)
                .toList();

        System.out.println(upToHundred);
    }
}

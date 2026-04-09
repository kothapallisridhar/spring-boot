import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {

        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.limit(5).forEach(System.out::println);

        Stream<Integer> limitedStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).limit(5);
        limitedStream.forEach(System.out::println);

        System.out.println("---------even stream------------");
        Stream<Integer> numbers2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> evenStream = numbers2.filter(n -> n % 2 == 0);
        evenStream.forEach(System.out::println);

        numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.limit(6).filter(n -> n % 2 == 0).forEach(System.out::println);

        System.out.println("---------map-----------");
        Stream<String> names = Stream.of("apple", "orange", "banana", "mango", "cucumber");
        Stream<String> newNames = names.map(n -> n.toUpperCase());
        newNames.peek(str -> System.out.println("peek result: " + str)).forEach(System.out::println);

        List<String> namesProcessed = Stream.of("apple", "orange", "banana", "mango").peek(str -> System.out.println("peek result: " + str)).filter(name -> name.length() < 6).toList();
        System.out.println(namesProcessed);

        System.out.println("---------distinct and sorted----------");
        numbers = Stream.of(1, 2, 2, 3, 5, 8, 12, 15, 20, 10, 10, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.distinct().sorted().forEach(System.out::println);

        System.out.println("---------concatenating streams----------");
        Stream<Integer> oddNumbers = Stream.of(1, 3, 5, 7, 9, 11);
        Stream<Integer> evenNumbers = Stream.of(2, 4, 6, 8, 10, 12);
        Stream.concat(oddNumbers, evenNumbers).sorted().forEach(System.out::println);

        System.out.println("---------object streams----------");
        Stream<Student> studentStream = Stream.of(
                new Student(1, "Foo"),
                new Student(2, "Bar"),
                new Student(3, "A")
        );
        List<String> studentNames = studentStream
                .filter(s -> s.getName().length() > 2)
                .map(Student::getName)
                .toList();
        System.out.println("Student names: " + studentNames);
    }
}

class Student {

    int id;
    String name;

    public Student(int i, String foo) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
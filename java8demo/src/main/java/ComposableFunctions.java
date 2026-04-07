import java.util.function.Function;

public class ComposableFunctions {
    public static void main(String[] args) {

        int i = 10;

        Function<Integer, Integer> increment = x -> x + 1;
        Function<Integer, Integer> doubleIt = x -> x * 2;
        Function<Integer , Integer> combine =  increment.andThen(doubleIt);

        System.out.println(combine.apply(i));

        String course = " java ";

        Function<String, String> trimLeading = String::stripLeading;
        Function<String, String> trimTrailing = String::stripTrailing;
        Function<String, String> upperCase = String::toUpperCase;

        String processedCourse = trimLeading
                .andThen(trimTrailing)
                .andThen(upperCase)
                .apply(course);
        System.out.println(processedCourse);
    }
}

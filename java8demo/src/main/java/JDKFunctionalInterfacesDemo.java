import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class JDKFunctionalInterfacesDemo {
    public static void main(String[] args) {

        Function<Integer, Integer> myFunc = x -> x * 2;
        System.out.println(myFunc.apply(10));

        Function<Integer, String> f2 = num -> "Value is " + num;
        System.out.println(myFunc.apply(12));

        Consumer<String> greeting = name -> System.out.println("Hello, " + name );
        greeting.accept("Universe!!!");

        Supplier<Double> random = () -> Math.random();
        System.out.println(random.get());

        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(10));

        Function<Integer, Boolean> isOdd = num -> num % 2 != 0;
        System.out.println(isOdd.apply(15));
    }
}

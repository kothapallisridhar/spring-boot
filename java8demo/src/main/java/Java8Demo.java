public class Java8Demo {

    public static void main(String[] args) {
        System.out.println("Lambda Expression");

    }
}

@FunctionalInterface
interface InterF {
    public void m1();
    default void m2() {

    }
    public static void m3() {

    }

}

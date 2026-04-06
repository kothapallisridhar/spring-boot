public interface InterfaceOne {
    void printNames();
    String getNames();

    default void defaultMethodOne() {
        System.out.println("default method one");
    }

    default void defaultMethodTwo() {
        System.out.println("default method two");
    }
}

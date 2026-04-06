public class ClassTwo implements InterfaceOne{
    @Override
    public void printNames() {
        System.out.println("CalssTwo : printNames()");
    }

    @Override
    public String getNames() {
        System.out.println("CalssTwo : getNames()");
        return "class two";
    }
}

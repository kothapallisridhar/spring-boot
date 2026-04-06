public class ClassOne implements InterfaceOne{
    @Override
    public void printNames() {
        System.out.println("In ClassOne : printNames()");
    }

    @Override
    public String getNames() {
        System.out.println("In ClassOne : getNames()");
        return "class one";
    }
}

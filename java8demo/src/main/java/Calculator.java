public class Calculator {

    public static int doMathOperation(IntOperation op, int a, int b) {
        return op.doOperation(a, b);
    }

    public static void main(String[] args) {
        IntOperation addition = (x, y) -> x + y;
        IntOperation subtraction = (x, y) -> x - y;

        System.out.println("result 1: " + doMathOperation(addition, 10, 20));
        System.out.println("result 2: " + doMathOperation(subtraction, 30, 20));
    }
}

interface IntOperation {
    int doOperation(int i, int j);
}

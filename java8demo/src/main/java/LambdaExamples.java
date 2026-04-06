public class LambdaExamples {
    public static void main(String[] args) {
        MathOperation increment = x -> x + 1;

        System.out.println("Result 1: " + increment.operation(10));

        MathOperation newLambda = x -> x * 2 + 122;

        System.out.println("Result 2: " + newLambda.operation(10));

        newLambda = increment;

        System.out.println("Result 3: " + newLambda.operation(20));

    }
}

interface MathOperation {
    int operation(int a);
}

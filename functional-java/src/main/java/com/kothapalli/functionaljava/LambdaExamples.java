package com.kothapalli.functionaljava;

public class LambdaExamples {
    public static void main(String[] args) {

        MathOperation increment = x -> x + 1;
        int result = increment.operation(10);
        System.out.println("Result: " + result);
        MathOperation newLambdaIncrement = x -> x * 4 * 135;
        int result2 = newLambdaIncrement.operation(10);
        System.out.println("Result: " + result2);

    }
}

interface MathOperation {
    int operation(int a);
}

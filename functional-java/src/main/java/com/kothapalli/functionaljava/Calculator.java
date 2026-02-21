package com.kothapalli.functionaljava;

public class Calculator {
    public static void doMathOperation(IntOperation op, int a, int b) {
        System.out.println("Result: "+ op.doOperation(a, b));
    }
    public static void main(String[] args) {
        IntOperation addition = (int a, int b) -> a + b;
        IntOperation subtraction = (int a, int b) -> a - b;

        doMathOperation(addition, 30, 20);
        doMathOperation(subtraction, 30, 20);
    }
}

@FunctionalInterface
interface IntOperation {
    int doOperation(int a, int b);
}

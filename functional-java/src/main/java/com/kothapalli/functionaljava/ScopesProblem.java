package com.kothapalli.functionaljava;

import java.util.function.Function;



public class ScopesProblem {

    public static Function<Integer, Integer> coutner() {
        int count = 0;

        Function<Integer, Integer> increment = x -> count + 1;
        return increment;
    }

    public static void main(String[] args) {
        Function<Integer, Integer> counter = ScopesProblem.coutner();
        System.out.println(counter.apply(10)); // it considers only the value in counter function
    }
}

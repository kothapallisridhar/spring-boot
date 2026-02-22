package com.kothapalli.functionaljava;

import java.time.LocalDateTime;
import java.util.function.BiConsumer;
import java.util.function.UnaryOperator;

public class LambdasComposability {

    public static void main(String[] args) {

        BiConsumer<UnaryOperator<Integer>, Integer> logger = (operation, number) -> {

            System.out.println("Start: " + LocalDateTime.now());
            operation.apply(number);
            System.out.println("End: " + LocalDateTime.now());
        };

        logger.accept(x -> x + 1, 10);
        logger.accept(x -> x * 100, 888);
    }
}

package com.kothapalli.functionaljava;

import java.time.LocalDateTime;

public class TaskRunner {

    public static void runner(Task task) {
        System.out.println("Start: " + LocalDateTime.now());
        task.run();
        System.out.println("End: " + LocalDateTime.now());
    }
    public static void main(String[] args) {

        Task task = () -> {
            System.out.println("Hello World!");
        };
        runner(task);
    }
}

interface Task {
    void run();
}

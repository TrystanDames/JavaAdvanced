package com.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ExecutorExample {

    public static void main(String[] args) {
        int cpuCount = Runtime.getRuntime().availableProcessors();
        ExecutorService es = Executors.newFixedThreadPool(cpuCount);
        es.execute(new ExampleRunnable("one"));
        es.execute(new ExampleRunnable("two"));        
        es.shutdown();
    }
}

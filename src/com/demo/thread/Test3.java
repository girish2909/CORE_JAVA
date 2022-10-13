package com.demo.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test3 {
    public static void main(String[] args) {
        final ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            // created thread will be created inside blocking queue
            executor.execute(new Task3());
        }
        System.out.println("Thread Name:::" + Thread.currentThread().getName());
    }
}

class Task3 implements Runnable {
    public void run() {
        System.out.println("Thread Name :: " + Thread.currentThread().getName());
    }
}

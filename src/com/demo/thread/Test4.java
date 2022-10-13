package com.demo.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test4 {
    public static void main(String[] args) {
        // if task is CPU intensive then get the count of processors and created
        // executor service witht that much value.
        int processorCount = Runtime.getRuntime().availableProcessors();
        System.out.println("total availabe processors : " + processorCount);
        final ExecutorService executor = Executors.newFixedThreadPool(processorCount);
        for (int i = 0; i < 1000; i++) {
            // created thread will be created inside blocking queue
            executor.execute(new CPU_Intensive_Task4());
        }
        System.out.println("Thread Name:::" + Thread.currentThread().getName());
    }
}

class CPU_Intensive_Task4 implements Runnable {
    public void run() {
        // write some cpu intensive operations
        System.out.println("Thread Name :: " + Thread.currentThread().getName());
    }
}

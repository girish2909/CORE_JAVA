package com.demo.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test5 {
    public static void main(String[] args) {
        // if task is IO intensive then take some fixed thread pool count in
        // very beginning
        int processorCount = 100;
        System.out.println("total availabe processors : " + processorCount);
        final ExecutorService executor = Executors.newFixedThreadPool(processorCount);
        for (int i = 0; i < 1000; i++) {
            // created thread will be created inside blocking queue
            executor.execute(new IO_Intensive_Task4());
        }
        System.out.println("Thread Name:::" + Thread.currentThread().getName());
    }
}

class IO_Intensive_Task4 implements Runnable {
    public void run() {
        // write some io intensive operations like DB calls, N/W calls, HTTP
        // calls.. etc
        System.out.println("Thread Name :: " + Thread.currentThread().getName());
    }
}

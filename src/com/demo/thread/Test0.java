package com.demo.thread;

public class Test0 {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Task());

        thread1.start();
        System.out.println("Thread Name ::" + Thread.currentThread().getName());
    }
}

class Task implements Runnable {
    public void run() {
        System.out.println("Thread Name ::" + Thread.currentThread().getName());
    }
}
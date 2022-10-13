package com.demo.thread;

public class Test1 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread1 = new Thread(new Task1());
            thread1.start();
        }
        System.out.println("Thread Name ::" + Thread.currentThread().getName());

    }
}

class Task1 implements Runnable {
    public void run() {
        System.out.println("Thread Name ::" + Thread.currentThread().getName());
    }
}
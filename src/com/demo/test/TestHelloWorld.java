package com.demo.test;

/*
 * Fixed Size Thread Pool
 * Cached Thread Pool
 * Scheduler Thread Pool < Delay Queues >
 *  :> Service.schedule(means certain delay)
 *  :> service.scheduleAtFixedRate
 *  :> service.scheduleAtFixedDelay
 * Single Threaded Executor 
 */
public class TestHelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World !!");
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}

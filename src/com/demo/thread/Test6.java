package com.demo.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test6 {

    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(10);

        // Task to run after 10 second delay
        service.schedule(new Task6(), 10, TimeUnit.SECONDS);

        // Tast to run repeatedly after every 10 seconds:
        service.scheduleAtFixedRate(new Task6(), 15, 10, TimeUnit.SECONDS);

        // Task to run repeatedly 10 seconds after previous task complete
        service.scheduleWithFixedDelay(new Task6(), 15, 10, TimeUnit.SECONDS);
    }
}

class Task6 implements Runnable {
    public void run() {
        System.out.println("Inside Task6");
    }
}

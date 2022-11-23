package com.java8.features;

// Create a thread using Lamda 
// Using both Runnable and Thread implementation
public class LamdaThreadExample {
	public static void main(String[] args) {
		
		Runnable runnable = () -> {
				System.out.println("thread is started");
		};
		new Thread(runnable).start();
		
		//OR
		Thread thread = new Thread(() -> System.out.println("I am a thread.."));
		
		thread.start();
	}
}

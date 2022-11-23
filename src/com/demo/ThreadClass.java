package com.demo;

public class ThreadClass extends Thread {

	public  boolean b = true;
	@Override
	public void run() {

		while(b) {
			System.out.println("I am inside run method.");
		}
	}

	public void stopIt() {
		this.b = false;
		System.out.println("I am inside stopIt method.");
	}

	public static void main(String[] args) throws InterruptedException {

		ThreadClass t1 = new ThreadClass();
		t1.start();
		Thread.sleep(500);
		t1.stopIt();
	}
}
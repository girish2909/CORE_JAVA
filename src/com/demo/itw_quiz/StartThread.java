package com.demo.itw_quiz;

public class StartThread  {

	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread is starting ....");
			}
		};
		
		new Thread(runnable).start();
		new Thread(()-> System.out.println("i am inside thread...")).start();


		
	}
}

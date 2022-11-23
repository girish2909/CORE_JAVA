package com.demo;

public abstract class Animal {

	String name = "???";
	public void printName() {
		// TODO Auto-generated method stub
		System.out.println(name);
	}
}

class Lion extends Animal {
	String name = "Leo";
	
}


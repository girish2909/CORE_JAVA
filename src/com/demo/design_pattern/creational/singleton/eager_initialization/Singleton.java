package com.demo.design_pattern.creational.singleton.eager_initialization;

public class Singleton {

	private final static Singleton INSTANCE = new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return INSTANCE;
	}
}

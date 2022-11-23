package com.demo.design_pattern.structural.proxy.impl;

import com.demo.design_pattern.structural.proxy.VeryExpensiveProcess;

public class VeryExpensiveProcessProxy implements VeryExpensiveProcess {

	private VeryExpensiveProcess process;
	
	@Override
	public void process() {
		if(process == null) {
			System.out.println("InsideVeryExpensiveProcessProxy.process(): Object Initialization....");
			process = new VeryExpensiveProcessImpl();
		}
		process.process();
	}

}

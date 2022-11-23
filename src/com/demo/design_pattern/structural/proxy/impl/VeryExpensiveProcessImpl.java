package com.demo.design_pattern.structural.proxy.impl;

import com.demo.design_pattern.structural.proxy.VeryExpensiveProcess;

public class VeryExpensiveProcessImpl implements VeryExpensiveProcess {

	
	public VeryExpensiveProcessImpl() {
		heavyInitialConfigurationSetup();
	}
 
	private void heavyInitialConfigurationSetup() {
		System.out.println("VeryExpensiveProcessImpl.heavyInitialConfigurationSetup() : Setting up initial configuration....");
	}
	
	@Override
	public void process() {
		System.out.println("VeryExpensiveProcessImpl.process(): Processing is done....");
	}

}

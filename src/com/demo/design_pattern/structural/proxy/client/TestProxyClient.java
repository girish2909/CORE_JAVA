package com.demo.design_pattern.structural.proxy.client;

import com.demo.design_pattern.structural.proxy.VeryExpensiveProcess;
import com.demo.design_pattern.structural.proxy.impl.VeryExpensiveProcessProxy;

public class TestProxyClient {
	public static void main(String[] args) {
		VeryExpensiveProcess veryExpensiveProcessOBJ = new VeryExpensiveProcessProxy();
		veryExpensiveProcessOBJ.process();
		
		System.out.println("====================================");
		veryExpensiveProcessOBJ.process();
	}
}

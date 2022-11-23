package com.demo.testmyself;

public class TestOverriding {

	static {
		System.out.println("hey I am inside static block");
	}
	
	//ENCAPSULATION
	
	
	public static void main(String[] args) {
		B obj = new B();
		B obj1 = new B();
		obj.setB("girish");
		
		System.out.println(obj1.getB());
		
		obj.setA("vineet");
		System.out.println(obj.getA());
		System.out.println(obj.getB());
	}
}


class B{
	
	static {
		System.out.println("hey I am inside static block v");
	}
	//iNSTANCE VARIABLE
	private String a;
	
	private static String b;

	public String getA() { /// accessor
		return a;
	}

	public void setA(String a) { /// mutator
		this.a = a;
	}

	public static String getB() {
		return b;
	}

	public static void setB(String b) {
		B.b = b;
	}
	
	
	
	
}
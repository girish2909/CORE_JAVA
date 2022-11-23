package com.demo.testmyself;

public class ChildForCovariant extends ParentForCovariant
{

	public  RuntimeException getValue() {
		return new RuntimeException();
	}
}

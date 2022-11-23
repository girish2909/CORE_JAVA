package com.demo.design_pattern.creational.prototype;

public class Student {
	private String name;
	private String studendId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudendId() {
		return studendId;
	}
	public void setStudendId(String studendId) {
		this.studendId = studendId;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", studendId=" + studendId + "]";
	}
	
}

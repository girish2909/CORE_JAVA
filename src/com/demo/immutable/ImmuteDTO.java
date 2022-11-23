package com.demo.immutable;

import java.util.Date;

public final class ImmuteDTO {

	private final String name;
	private final Date dob;
	public ImmuteDTO(String name, Date dob) {
		this.name = name;
		this.dob = dob;
	}
	public String getName() {
		return name;
	}
	public Date getDob() {
		return dob;
		// created defensive copy to make class fully immutable
		//return new Date(dob.getTime());
	}
	@Override
	public String toString() {
		return "ImmuteDTO [name=" + name + ", dob=" + dob + "]";
	}
	
	
	
	
}

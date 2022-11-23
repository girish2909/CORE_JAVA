package com.demo.immutable;

import java.util.Date;

public class TestImmutable {

	public static void main(String[] args) {
		ImmuteDTO dto = new ImmuteDTO("girish", new Date("09/22/2022"));
		System.out.println(dto);
		dto.getDob().setTime(new Date().getTime());
		System.out.println(dto);
	}
}

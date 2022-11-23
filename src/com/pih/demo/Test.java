package com.pih.demo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		byte c1[] = {10};
		ByteArrayOutputStream b1 = new ByteArrayOutputStream(10);
		
		b1.write(100);
		b1.write(100);
		System.out.println(b1.size());
	}
	
}

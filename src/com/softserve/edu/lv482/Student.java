package com.softserve.edu.lv482;

import java.util.Scanner;

public class Student {
	private String name;

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		// Add data
		return name;
	}

	public void setName(String name) {
		// Check
		this.name = name;
	}
	
	public void readName() {
		Scanner sc = new Scanner(System.in);  
		System.out.print("name = ");
		//name = sc.nextLine();
		setName(sc.nextLine());
	}
	
}

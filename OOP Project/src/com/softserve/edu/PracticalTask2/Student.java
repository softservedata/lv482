package com.softserve.edu.PracticalTask2;

public class Student extends Person {
	private final String TYPE_PERSONE="STUDENT";
	Student(String name) {
		super(name);
		System.out.println(TYPE_PERSONE);
	}

	@Override
	public String print() {
		return ("I am a STUDENT "+ name);
	}

}

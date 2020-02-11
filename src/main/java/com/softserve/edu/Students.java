package com.softserve.edu;

public class Students extends PersonAbstract {
	
	private static final String TYPE_PERSON =  "student";
	
	public Students(String name) {
		this.name = name;
		System.out.println(TYPE_PERSON);
	}
	
	@Override
	void print(){
		System.out.println("I am a student.");
	}
}

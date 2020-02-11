package com.softserve.edu;

public class Cleaners extends Staff {
	
	private static final String TYPE_PERSON =  "cleaner";

	public Cleaners(String name) {
		this.name = name;
		System.out.println(TYPE_PERSON);
	}
	@Override
	void print(){
		System.out.println("I am a cleaner.");
	}
	
	@Override
	void salary() {
		System.out.println("My salary = 200$.");
	}
}

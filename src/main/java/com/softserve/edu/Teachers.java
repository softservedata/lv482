package com.softserve.edu;

public class Teachers extends Staff{
	
	private static final String TYPE_PERSON =  "teacher";
	
	public Teachers(String name) {
		this.name = name;
		System.out.println(TYPE_PERSON);
	}
	
	@Override
	void print(){
		System.out.println("I am a teacher.");
	}
	
	@Override
	static void salary() {
		System.out.println("My salary = 4000$.");
	}

}

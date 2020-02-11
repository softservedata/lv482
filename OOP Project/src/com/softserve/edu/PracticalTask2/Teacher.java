package com.softserve.edu.PracticalTask2;

public class Teacher extends Staff{
	private final String TYPE_PERSONE="TEACHER";
	protected double sallary;
	
	Teacher(String name, double sallary) {
		super(name);
		this.sallary=sallary;
		System.out.println(TYPE_PERSONE);
	}

	@Override
	public double sallary() {	
		return sallary;
	}

	@Override
	public String print() {	
		return "I am a TEACHER "+name;
	}

}

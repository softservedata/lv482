package com.softserve.edu.PracticalTask2;

public class Cleaner extends Staff {
	private final String TYPE_PERSONE="CLEANER";
	protected double sallary;
	
	Cleaner(String name, double sallary) {
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
		return "I am a CLEANER " +name;
	}
	

}

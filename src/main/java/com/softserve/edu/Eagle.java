package com.softserve.edu;

public class Eagle extends FlyingBird{

	@Override
	public void fly() {
		System.out.println("Eagles fly high.");
		
	}
	
	public Eagle(String feathers, int layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
	}

	@Override
	public void input() {
		System.out.println("I am an eagle. My feathers is " + feathers + ". I lay " + layEggs + " per month");
		
	}

}

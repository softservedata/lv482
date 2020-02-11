package com.softserve.edu;

public class Swallow extends FlyingBird {

	@Override
	public void fly() {
		System.out.println("Swallow don't fly high.");
		
	}
	
	public Swallow(String feathers, int layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
	}
	
	@Override
	public void input() {
		System.out.println("I am a swallow. My feathers is " + feathers + ". I lay " + layEggs + " per month");
		
	}

}

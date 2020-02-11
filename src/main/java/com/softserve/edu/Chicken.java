package com.softserve.edu;

public class Chicken extends NonFlyingBird{

	@Override
	public void fly() {
		System.out.println("Chikens cann't fly.");
		
	}
	
	public Chicken(String feathers, int layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
	}
	
	@Override
	public void input() {
		System.out.println("I am a chicken. My feathers is " + feathers + ". I lay " + layEggs + " per month");
		
	}

}

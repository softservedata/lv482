package com.softserve.edu;

public class Penguin extends NonFlyingBird{

	@Override
	public void fly() {
		System.out.println("Penguin don't fly. They swimm");
		
	}
	
	public Penguin(String feathers, int layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
	}
	
	@Override
	public void input() {
		System.out.println("I am a penguin. My feathers is " + feathers + ". I lay " + layEggs + " per month");
		
	}

}

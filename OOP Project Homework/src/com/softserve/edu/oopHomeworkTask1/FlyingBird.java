package com.softserve.edu.oopHomeworkTask1;

public abstract class FlyingBird extends Bird {

	public FlyingBird(String nameOfBird, boolean layEggs, boolean feathers) {
		super(nameOfBird, layEggs, feathers);
	}

	@Override
	public String fly() {
		return " [This bird CAN fly]";
	}
	

}

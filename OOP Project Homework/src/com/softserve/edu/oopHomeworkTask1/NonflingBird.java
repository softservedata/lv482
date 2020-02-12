package com.softserve.edu.oopHomeworkTask1;

public abstract class NonflingBird extends Bird {

	public NonflingBird(String nameOfBird, boolean layEggs, boolean feathers) {
		super(nameOfBird, layEggs, feathers);
	}

	@Override
	public String fly() {
		return " [This bird CAN NOT fly]";
	}

}

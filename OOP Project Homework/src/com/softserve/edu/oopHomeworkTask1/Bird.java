package com.softserve.edu.oopHomeworkTask1;

public abstract class Bird {
	
	private boolean layEggs;
	private boolean feathers;
	private String nameOfBird;
	
	public Bird(String nameOfBird, boolean layEggs, boolean feathers) {
		this.nameOfBird=nameOfBird;
		this.layEggs=layEggs;
		this.feathers=feathers;
	}
	
	public String getNameOfBird() {
		return nameOfBird;
	}

	public boolean isLayEggs() {
		return layEggs;
	}

	public boolean isFeathers() {
		return feathers;
	}

	public abstract String fly();
	
}

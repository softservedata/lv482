package com.softserve.edu;

public class Cats implements Animals {
	
	private String name;
	public static int countCats = 0;
	
	public Cats(String name) {
		this.name = name;
		countCats++;
	}

	@Override
	public String toString() {
		return "Cats [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void voice() {
		System.out.println("Cat says meav");
		
	}

	@Override
	public void feed() {
		System.out.println("I would like whiskas!");
		
	}

}

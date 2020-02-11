package com.softserve.edu;

public class Dogs implements  Animals{
	
	private String name;
	
	public static int countDogs = 0;
	
	public Dogs(String name) {
		this.name = name;
		countDogs++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "Dogs [name=" + name + "]";
	}

	@Override
	public void voice() {
		System.out.println("Dog says gav");
	}

	@Override
	public void feed() {
		System.out.println("I would like meat!");
		
	}
	
}

package com.softserve.edu.PracticalTask1;

public class Dog implements Animal {

	@Override
	public void voice() {
		System.out.println("GAW GAW GAW");	
	}

	@Override
	public void feed() {
		System.out.println("I am dog");
	}

}

package com.softserve.edu.PracticalTask2;

public abstract class Person {
	protected String name;
	Person(String name){
		this.name=name;
	}
	public abstract String print();
}

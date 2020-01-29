package com.softserve.edu.lv482;

class Person {
	String name; // = null;

	public Person() {
		name = "111";
	}
	
	// Overload
	public void print() {
		System.out.println(name);
	}

	// error Overload
//	public int print() {
//		System.out.println(name);
//		return 1;
//	}

	// Overload
	public void print(String s) {
		System.out.println(s + "1 " + name);
	}
	
	public void print(String... messages) {
		for (String current : messages) {
			System.out.print(current + "_");
		}
		System.out.println(" 2 " + name);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
}

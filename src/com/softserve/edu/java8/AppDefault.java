package com.softserve.edu.java8;

interface Vehicle {
	void work();

	default void print() {
		System.out.println("I am a vehicle!");
	}

	static void blowHorn() {
	      System.out.println("Blowing horn!!!");
	   }

}

interface FourWheeler {
	void work();

	default void print() {
		System.out.println("I am a four wheeler!");
	}
}

class Car implements Vehicle, FourWheeler {
	
	public void print() {
		Vehicle.super.print();
	}

	public void work() {
		System.out.println("work");
	}

//	public void FourWheeler.work() {
//		System.out.println("work");
//	}
}

public class AppDefault {
	public static void main(String[] args) {
		// new Car().print();
		// new Car().work();
		FourWheeler v = new Car();
		//v.work();
		v.print();
		Vehicle.blowHorn();
	}
}

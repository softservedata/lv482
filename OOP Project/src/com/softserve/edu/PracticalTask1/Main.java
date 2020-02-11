package com.softserve.edu.PracticalTask1;

public class Main {
	public static void main(String[] args) {
		Animal[] animalArray=new Animal[5];
		animalArray[0]=new Cat();
		animalArray[1]=new Dog();
		animalArray[2]=new Cat();
		animalArray[3]=new Cat();
		animalArray[4]=new Dog();
		
		
		for(Animal animal:animalArray) {
			animal.feed();
			animal.voice();
			System.out.println("------------------");
		}
	}
}

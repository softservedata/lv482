package com.softserve.educonditionalStatements;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/** 
 * cONDITIONAL sTATEMENTS
 * 
 * Homework. Task 2
 * 
 * Сreate class Dog with fields name, breed, age. 
	Declare enum for field breed. 
	Create 3 instances of type Dog. 
	Check if there is no two dogs with the same name. 
	Display the name and the kind of the oldest dog. 
 * 
 *
 */

public class Dog  {

	public static void main(String[] args) {
		
		List<Dog> list = new ArrayList<Dog>();
		
		list.add(new Dog("Vasa", Bread.HASKI, 12));
		list.add( new Dog("Lisa", Bread.SHARPEI, 12));
		list.add( new Dog("Barsik", Bread.PITBULL, 11));
		
		list.sort(new AgeComparator());
		//System.out.println(list);
		
		for (int i = 1; i < list.size(); i++) {
			if(list.get(i).getAge() == list.get(i-1).getAge()) {
					System.out.println(list.get(i).toString());
					System.out.println(list.get(i-1).toString());
			}
		}
		int count =0;
		int maxAge = list.get(0).getAge();
		for (int i = 0; i < list.size(); i++) {
			if(maxAge < list.get(i).getAge()) {
				maxAge = list.get(i).getAge();
				count++;
			}
		}
		System.out.println();
		System.out.println(list.get(count).toString());
	}
	
		public static class AgeComparator implements Comparator<Dog>{
		@Override
		public int compare(Dog arg0, Dog arg1) {
			
			return (arg0.getAge() - arg1.getAge());
		}
		}
	
	private String name;
	Bread breed ;
	private int age;
	
	public Dog(String name, Bread breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Bread getBreed() {
		return breed;
	}

	public void setBreed(Bread breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", age=" + age + "]";
	}

	
	
	
}

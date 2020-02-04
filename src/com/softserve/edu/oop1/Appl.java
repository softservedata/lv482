package com.softserve.edu.oop1;

public class Appl {

	public static void man(String[] args) {
		Student student1 = new Student("Ivan", 2);
		Student student2 = new Student("Petro", 6);
		Student student3 = new Student("Stepan", 1);
		//
		if (student1.betterStudent(student2)) {
			if (student1.betterStudent(student3)) {
				System.out.println(student1);
			} else {
				System.out.println(student3);
			}
		} else {
			if (student2.betterStudent(student3)) {
				System.out.println(student2);
			} else {
				System.out.println(student3);
			}
		}
		System.out.println("Average= " + Student.getAvgRating());
	}
}

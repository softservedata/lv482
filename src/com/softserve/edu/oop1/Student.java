package com.softserve.edu.oop1;

public class Student {

	private String name;
	private int rating;
	private static double avgRating; // = 0.0;
	private static int countStudents;

	static {
		System.out.println("Student, running static block");
		avgRating = 0.0;
		countStudents = 0;
	}

	public Student() {
		name = "";
		rating = 0;
	}

	public Student(String name, int rating) {
		this.name = name;
		this.rating = rating;
		avgRating = avgRating + rating;
		countStudents++;
	}

	public static double getAvgRating() {
		return avgRating / countStudents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public boolean betterStudent(Student student) {
		return this.getRating() > student.getRating();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rating=" + rating + "]";
	}

}

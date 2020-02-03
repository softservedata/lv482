package com.softserve.edu.homework;

import java.util.Scanner;

public class Person {
	private String firstName;
	private String lastName;
	private int birthYear;
	
	Person(){
		firstName="";
		lastName="";
		birthYear=0;
	}
	Person(String firstName, String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public void input() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first name: ");
		firstName=sc.nextLine();
		System.out.println("Enter last name: ");
		lastName=sc.nextLine();
		System.out.println("Enter year of birth: ");
		birthYear=sc.nextInt();
		
	}
	public int getAge() {
		return 2020-birthYear;
	}
	public void changeName(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public String output() {
		return "First name: ["+firstName+"] Last name: ["+lastName+"] age: ["+getAge()+"]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	

}

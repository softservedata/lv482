package com.softserve.edu;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class Person {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		Person p1 = new Person();
		p1.input(sc);
		System.out.println(p1.output(p1));
		
		Person p2 = new Person();
		p2.input(sc);
		
		Person p3 = new Person();
		p3.input(sc);
		
		Person p4 = new Person();
		p4.input(sc);
		
		Person p5 = new Person();
		p5.input(sc);
		
	}
	
	private String firstName;
	private String lastName;
	private int birthYear;
	
	public String getFirstName() {
		return firstName;	
	}
	
	public void  setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLasstName() {
		return lastName;	
	}
	
	public void  setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getBirthYear() {
		return birthYear;	
	}
	
	public void  setBirthYear(int  birthYear) {
		this.birthYear =  birthYear;
	}
	
	public Person() {
		
	}
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public int getAge(int birthYear) {
		int age = LocalDate.now().getYear()-birthYear;
		return age;
	}
	
	public void input (Scanner sc) {
		System.out.println("Enter name: ");
	    this.firstName = sc.nextLine();
		System.out.println("Enter lastname: ");
		this.lastName = sc.nextLine();
		System.out.println("Enter year of birth: ");
		this.birthYear = sc.nextInt();
	}
	
	public String output (Person p) {
		return "Person: name is: " + p.getFirstName() + " " + p.getLasstName() + 
				"age = " +  p.getAge(birthYear);
	}
	
	
	
	
}

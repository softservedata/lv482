package com.softserve.edu.homework;

public class Main {
	public static void main(String[] args) {
		Person p1= new Person();
		Person p2= new Person();
		Person p3= new Person();
		Person p4= new Person();
		Person p5= new Person();
		
		System.out.println("Enter data about first person: ");
		p1.input();
		System.out.println("Enter data about second person: ");
		p2.input();
		System.out.println("Enter data about third person: ");
		p3.input();
		System.out.println("Enter data about fourth person: ");
		p4.input();
		System.out.println("Enter data about fifth person: ");
		p5.input();
		
		
		System.out.println(p1.output());
		System.out.println(p2.output());
		System.out.println(p3.output());
		System.out.println(p4.output());
		System.out.println(p5.output());
		
		p2.changeName("Sam", "Karnel");
		System.out.println("P2 after changes:");
		System.out.println(p2.output());
		
	}

}

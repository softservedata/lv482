package com.softserve.edu;

import java.io.IOException;
import java.util.Scanner;

public class Employee {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		Employee e1 = new Employee( "fg",  1, 1);
		System.out.println("Enter name");
		e1.setName(sc);
		System.out.println("Enter rate");
		e1.setRate(sc);
		System.out.println("Enter hours");
		e1.setHours(sc);
		totalSum = totalSum + (e1.rate*e1.hours);
			
		Employee e2 = new Employee();
		System.out.println("Enter name");
		e2.setName(sc);
		System.out.println("Enter rate");
		e2.setRate(sc);
		System.out.println("Enter hours");
		e2.setHours(sc);
		totalSum = totalSum + (e2.rate*e2.hours);
		
		Employee e3 = new Employee();
		System.out.println("Enter name");
		e3.setName(sc);
		System.out.println("Enter rate");
		e3.setRate(sc);
		System.out.println("Enter hours");
		e3.setHours(sc);
		totalSum = totalSum + (e3.rate*e3.hours);
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
		
		System.out.println(totalSum);
			
	}
	
	private String name;
	private double rate;
	private int hours;
	public static double totalSum = 0;
	
	public String getName() {
		return this.name;
	}
    
	public void setName(Scanner sc) {
		this.name = sc.nextLine();
}
	public double getRate() {
		return this.rate;
	}
	
	public void setRate(Scanner sc) {
		this.rate = sc.nextDouble();
	}
	
	public int getHours() {
		return hours;	
	}
	
	public void setHours(Scanner sc) {
		this.hours = sc.nextInt();
	}
	
	public Employee() {
		
	}
	
	public Employee(String name, double rate) {
		this.name = name;
		this.rate = rate;	
	}
	
	public Employee(String name, double rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		totalSum = totalSum + (rate*hours);
			
	}
	
	public  double getSalary(double rate, int hours) {	
		return rate*hours;	
	}
	
	public  void changeRate(double rate) {
		this.rate = rate;	
	}
	
	public double getBonuses(Employee e) {
		double salary = e.getSalary(rate, hours);
		double bonuses = 0.1 * salary;	
		return bonuses;
	}
	
	@Override
	public String toString() {
		return "Employee [name " + name + ", rate " + rate + "]";
	}
	
	
}
	
	
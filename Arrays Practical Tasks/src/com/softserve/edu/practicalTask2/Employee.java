package com.softserve.edu.practicalTask2;

public class Employee {
	
	private String name;
	private int departamentNumber;
	private double salary;
	
	public Employee() {
		name = "";
		departamentNumber = 0;
		salary = 0;
	}
	public Employee(String name, int departamentNumber, double salary) {
		this.name = name;
		this.departamentNumber = departamentNumber;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartamentNumber() {
		return departamentNumber;
	}

	public void setDepartamentNumber(int departamentNumber) {
		this.departamentNumber = departamentNumber;
	}

	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Name = ["+name+"] departament number = ["+departamentNumber+"] salary = ["+salary+"]";
	}
	
}

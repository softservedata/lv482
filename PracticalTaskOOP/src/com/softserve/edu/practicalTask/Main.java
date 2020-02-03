package com.softserve.edu.practicalTask;

public class Main {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Adam",10.0,10.0);
		Employee emp2 = new Employee("John",10.0,10.0);
		Employee emp3 = new Employee("Mike",10.0,10.0);
		
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		System.out.println(emp3.toString());
		System.out.println("Total salary of all workers "+emp1.getTotalSum());
		
		emp1.changeRate(11);
		emp2.changeRate(12);
		emp2.changeRate(15);
		
		System.out.println();
		System.out.println("--------------------Information about employees after changes--------------------------");
		System.out.println();
		
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		System.out.println(emp3.toString());
		System.out.println("Total salary of all workers "+emp1.getTotalSum());
		
	}
}

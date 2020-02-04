package com.softserve.edu.practicalTask2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
		Employee[] arr=new Employee[5];
		
		arr[0] = new Employee("Adam",2,2000);
		arr[1] = new Employee("Rob",3,2500);
		arr[2] = new Employee("Kevin",3,3000);
		arr[3] = new Employee("Sam",4,3000);
		arr[4] = new Employee("James",3,4000);
		
		System.out.println("Enter number of depart");
		Scanner sc = new Scanner(System.in);
		int departureNumber=sc.nextInt();
		
		for (Employee emp:arr) {
			if(departureNumber==emp.getDepartamentNumber()) {
				System.out.println(emp);
			}
		}
		
		System.out.println();
		System.out.println("-----------------Sorted array by salary-------------------");
		
		
		Employee tmp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].getSalary() < arr[j].getSalary()) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for (Employee emp:arr) {
				System.out.println(emp);
		}
							
	}
	
}

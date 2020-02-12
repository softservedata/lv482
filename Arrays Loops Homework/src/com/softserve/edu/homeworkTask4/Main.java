package com.softserve.edu.homeworkTask4;

import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
	
		Car[] arrayOfCars=new Car[4];
		arrayOfCars[0]=new Car(1999,4);
		arrayOfCars[1]=new Car(1998,3);
		arrayOfCars[2]=new Car(1999,5);
		arrayOfCars[3]=new Car(2000,2);
		
		for(Car i:arrayOfCars) {
			System.out.println(i.toString());
		}
		System.out.println("Enter year");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		for(Car i:arrayOfCars) {
			if(i.getYear()==year) {
				System.out.println(i.toString());
			}
		}
		System.out.println();
		System.out.println("-----------------Sorted array by capacity-------------------");
		
		
		Car tmp;
		for (int i = 0; i < arrayOfCars.length - 1; i++) {
			for (int j = i + 1; j < arrayOfCars.length; j++) {
				if (arrayOfCars[i].getCapacity() > arrayOfCars[j].getCapacity()) {
					tmp = arrayOfCars[i];
					arrayOfCars[i] = arrayOfCars[j];
					arrayOfCars[j] = tmp;
				}
			}
		}
		
		for (Car car:arrayOfCars) {
				System.out.println(car.toString());
		}
		
		
		sc.close();
	}
	

}

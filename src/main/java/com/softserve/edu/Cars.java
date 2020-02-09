package com.softserve.edu;

import java.util.Scanner;

public class Cars {

	public static void main(String[] args) {

		/** Task1. Arrays & Loops.Homework */

		Scanner sc = new Scanner(System.in);
		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.println("Enter year, please:");
		try {
			int year = Integer.parseInt(sc.nextLine());
			if (year % 4 == 0) {
				days[1] = days[1] + 1;
			}
			System.out.println("Enter number of month, please:");
			int month = Integer.parseInt(sc.nextLine());
			System.out.println("Tne amount of " + month + "th month is equal to " + days[month - 1]);
		} catch (Exception e) {
			System.out.println("Something went wrong.");
		}

		/** Task2. Arrays & Loops.Homework */

		int[] array = new int[10];
		System.out.println("Enter 10 numbers, please: ");
		try {
			for (int i = 0; i < array.length; i++) {
				array[i] = Integer.parseInt(sc.nextLine());
			}
		} catch (Exception e) {
			System.out.println("Something went wrong.");
		}

		int count = 0;
		int sumOfFiveElements = 0;
		int productOfLastFive = 1;

		for (int i = 0; i < 5; i++) {
			if (array[i] > 0) {
				count++;
				sumOfFiveElements = sumOfFiveElements + array[i];
			}
		}
		// System.out.println(count);
		if (count == 5) {
			System.out.println("The sum of five first elements is " + sumOfFiveElements);
		} else {
			for (int i = 5; i < array.length; i++) {
				productOfLastFive = productOfLastFive * array[i];
			}
			System.out.println("The product of five last elements is " + productOfLastFive);
		}

		/** task 3. Arrays & Loops.Homework */

		int[] arr = new int[5];
		System.out.println("Enter 5 numbers, please: ");
		try {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(sc.nextLine());
			}

		int countPositive = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				countPositive++;
				if (countPositive == 2) {
					System.out.println("Position of second positive number is " + (i + 1));
					break;
				}
			}
		}
		int numberOfminimum = 0;
		int minimum = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < minimum) {
				minimum = arr[i];
				numberOfminimum = i;
			}
		}
		System.out.println(
				"Minimal number is " + minimum + " there is " + (numberOfminimum + 1) + "th element of array.");
	} 
		catch (Exception e) {
		System.out.println("Something went wrong.");
	}
		/** task 4. Arrays & Loops.Homework */

		Cars[] car = new Cars[4];
		System.out.println("Enter parametrs of car:");
		String clas;
		int year;
		int capasity;
		try{
		for (int i = 0; i < car.length; i++)  {
			System.out.print("Enter class of car");
			clas = sc.nextLine();
			System.out.print("Enter year of production ");
			year = Integer.parseInt(sc.nextLine());
			System.out.print("Enter engine capasity ");
			capasity = Integer.parseInt(sc.nextLine());
			car[i] = new Cars(clas, year, capasity);
		}
		
		System.out.println("Enter year of production of car ");
	
			int yearOfProduction = Integer.parseInt(sc.nextLine());
			for (int i = 0; i < car.length; i++) {
				if( car[i].getYear() == yearOfProduction) {
					System.out.println(car[i]);
				}
			}
		}
			catch(Exception e){
				System.out.print("Somethig went wrong. Try one more time.");
		}
		Cars temp;
		for(int i = 0; i < car.length - 1 ; i++) {
			for(int j = i + 1; j < car.length; j++) {
				if (car[i].getYear() < car[j].getYear()) {
					temp = car[i];
					car[i] = car[j];
					car[j] = temp;
				}
			}
		}
		
		for(Cars currentCar : car) {
				System.out.println(currentCar);
			}

	}

	private String clas;
	private int year;
	private int capasity;

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getCapasity() {
		return capasity;
	}

	public void setCapasity(int capasity) {
		this.capasity = capasity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capasity;
		result = prime * result + ((clas == null) ? 0 : clas.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cars other = (Cars) obj;
		if (capasity != other.capasity)
			return false;
		if (clas == null) {
			if (other.clas != null)
				return false;
		} else if (!clas.equals(other.clas))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cars [clas=" + clas + ", year=" + year + ", capasity=" + capasity + "]";
	}

	public Cars(String clas, int year, int capasity) {
		this.clas = clas;
		this.year = year;
		this.capasity = capasity;
	}

	public Cars(String clas, int year) {
		this.clas = clas;
		this.year = year;

	}

	public Cars(String clas) {
		this.clas = clas;
	}

	public Cars() {

	}

}

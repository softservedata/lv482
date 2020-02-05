package com.softserve.edu.arrays;

import java.util.Arrays;
import java.util.Scanner;

class Car { // POJO
	private String name;

	public Car(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Car [ name = " + name + " ]";
	}
}

class Employee {
	private String name;
	private int departmentNumber;
	private double salary;

	public Employee(String name, int departmentNumber, double salary) {
		this.name = name;
		this.departmentNumber = departmentNumber;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "\nEmployee [ name = " + name + ", departmentNumber = " + departmentNumber + ", salary = " + salary + " ]";
	}
}

public class Appl {

	public static void main(String[] args) {
		/*-
		//		int[] arr = new int[5];
		//		arr[0] = 11;
		//		arr[1] = 22;
		//		arr[2] = 8;
		//		arr[3] = 55;
		//		arr[4] = 44;
		//		int[] arr = {11, 22, 8, 55, 33, 44, 7};
		//		System.out.println("Original Array:");
		//		for (int i = 0; i < arr.length; i++) {
		//			System.out.print(arr[i] + "  ");
		//		}
		//
		//		Car[] cars = new Car[4];
		//		cars[0] = new Car("BMW");
		//		cars[1] = new Car("Mercedes");
		//		cars[2] = new Car("Audi");
		//		cars[3] = new Car("Renault");
		Car[] cars = {new Car("BMW"), new Car("Mercedes"), new Car("Audi"), new Car("Renault")};
		System.out.println("Original Cars:");
		//		for (Car car : cars) {
		//			//System.out.println(car.getName());
		//			System.out.println(car);
		//		}
		System.out.println(Arrays.toString(cars));
		*/
		//
		/*-
		//		double[][] twoDim = { { 0, 1, 2, 3 },
		//			  			 	  { 4, 5, 6, 7 },
		//			  			 	  { 8, 9, 10, 11 },
		//			  			 	  { 12, 13, 14, 15 } };
				double[][] twoDim = { { 0, 1, 2, 3 },
									  { 40, 50, -1, 8, 9 },
					 	  			  { 4, 5 },
					 	  			  { 8 },
					 	  			  { 12, 13, 14 } };
		//		double[][] twoDim = new double[3][];
		//		twoDim[0] = new double[4];
		//		twoDim[0][0] = 0;
		//		twoDim[0][1] = 1;
		//		twoDim[0][2] = 2;
		//		twoDim[0][3] = 3;
		//		twoDim[1] = new double[3];
		//		twoDim[1][0] = -4;
		//		twoDim[1][1] = -4;
		//		twoDim[1][2] = -1;
		//		twoDim[2] = new double[2];
		//		twoDim[2][0] = 4;
		//		twoDim[2][1] = 5;
		System.out.println("Original Array:");
		//		for (int i = 0; i < twoDim.length; i++) {
		//			for (int j = 0; j < twoDim[i].length; j++) {
		//				System.out.print(twoDim[i][j] + "  ");
		//			}
		//			System.out.println();
		//		}
		for (double[] row : twoDim) {
			for (double element : row) {
				if (element < 0){
					//break;
					continue;
				}
				System.out.print(element + "  ");
			}
			System.out.println();
		}
		*/
		//
		/*-
		int number = 0; // 10
		//		while (number <= 5) {
		//			System.out.print(number + "  ");
		//			number++;
		//		}
		do {
		    System.out.print(number + "   ");
		    number++;
		} while (number <= 5);
		System.out.println("\ndone, number = " + number);
		//
		int[] numbers = { 1, 2, 3, 4, 5, 7, 9 };
		//		for(int i = 0; i < numbers.length; i++){
		//		    System.out.print(numbers[i] + "  ");
		//		}
		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.print(numbers[i] + "  ");
		}
		*/
		//
		/*-
		Scanner sc = new Scanner(System.in);
		int n = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print("Input number: ");
			n = sc.nextInt();
			if (n < 0){
				System.out.println("Stop reading");
				break;
			}
		}
		System.out.println("Last n = " + n);
		sc.close();
		*/
		//
		/*-
		//int[] arr = { 2, -5, 7, -4, 8 };
		//		int sum = 0;
		//		for (int i = 0; i < arr.length; i++) {
		//			sum += arr[i]; // sum = sum + arr[i];
		//		}
		//		System.out.println("Sum = " + sum);
		//
		//		int product = 1;
		//		for (int i = 0; i < arr.length; i++) {
		//			if (arr[i] > 0) {
		//				product = product * arr[i];
		//			}
		//		}
		//		System.out.println("Product = " + product);
		//
		//		int amount = 0;
		//		for (int a : arr) {
		//			if (a > 0 && a <= 7) {
		//				amount++;
		//			}
		//		}
		//		System.out.println("Amount = " + amount);
		//
		int[] arr = { 2, -5, 7, -4, 8, -6, 4 };
		//		int max = arr[0];
		//		int imax = 0;
		//		int i = 0;
		//		while (i < arr.length) {
		//			if (arr[i] > max) {
		//				max = arr[i];
		//				imax = i;
		//			}
		//			i++;
		//		}
		//		System.out.print("Maximum = " + max);
		//		System.out.println(" is in " + (imax + 1) + " place");
		//
		int min = arr[0];
		int imin = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				imin = i;
				System.out.println("new min found: " + min);
			}
		}
		System.out.print("Minimum = " + min);
		System.out.println(" is in " + (imin + 1) + " place");
		*/
		//
		/*-
		int[] arr = { 2, -5, 7, -4, 8, -6, 4 };
		System.out.println("Original Array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		//
		//		int tmp;
		//		for (int i = 0; i < arr.length - 1; i++) {
		//			for (int j = 0; j < arr.length - 1 - i; j++) {
		//				if (arr[j] > arr[j+1]) {
		//					tmp = arr[j];
		//					arr[j] = arr[j+1];
		//					arr[j+1] = tmp;
		//				}
		//			}
		//		}
		//
		Arrays.sort(arr);
		//
		System.out.println("\nSorted Array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		*/
		//
		/*-
		Car[] cars = {new Car("Renault"), new Car("Mercedes"), new Car("Audi"), new Car("BMW") };
		System.out.println("Original Array: " + Arrays.toString(cars));
		//
		Car tmp;
		for (int i = 0; i < cars.length - 1; i++) {
			for (int j = 0; j < cars.length - 1 - i; j++) {
				if (cars[j].getName().compareTo(cars[j+1].getName()) > 0) {
					tmp = cars[j];
					cars[j] = cars[j+1];
					cars[j+1] = tmp;
				}
			}
		}
		//
		// Arrays.sort(cars); // Runtime Error
		//
		System.out.println("\nSorted Array: " + Arrays.toString(cars));
		*/
		//
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Count of Employee, n = ");
		int n = Integer.parseInt(sc.nextLine());
		Employee[] emp = new Employee[n];
		String name;
		int departmentNumber;
		double salary;
		for (int i = 0; i < n; i++) {
			System.out.print("\nEnter Employee name = ");
			name = sc.nextLine();
			System.out.print("Enter Employee departmentNumber = ");
			departmentNumber = Integer.parseInt(sc.nextLine());
			System.out.print("Enter Employee salary = ");
			salary = Double.parseDouble(sc.nextLine());
			emp[i] = new Employee(name, departmentNumber, salary);
		}
		//
		System.out.print("\nEnter certain department = ");
		int certainDepartment = sc.nextInt();
		sc.close();
		//
		System.out.println("\nAll employees of a certain department:");
		for (Employee currentEmployee : emp) {
			if (currentEmployee.getDepartmentNumber() == certainDepartment) {
				System.out.print(currentEmployee);
			}
		}
		//
		System.out.println("\nOriginal Employees:\n" + Arrays.toString(emp));
		Employee tmp;
		for (int i = 0; i < emp.length - 1; i++) {
			for (int j = 0; j < emp.length - 1 - i; j++) {
				if (emp[j].getSalary() < emp[j + 1].getSalary()) {
					tmp = emp[j];
					emp[j] = emp[j + 1];
					emp[j + 1] = tmp;
				}
			}
		}
		System.out.println("\nsorted Employees:\n" + Arrays.toString(emp));
		//
	}

}

package com.softserve.edu;

import java.util.Arrays;
import java.util.Scanner;

public class Employees {

	/** practical task 1 */

	public static void main(String[] args) {
		System.out.println("Enter number of values");
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] arr = new int[n];
		System.out.println("Enter" + n + " values of array");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(sc.nextLine());
		}

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		int positiveSum = 0;
		int countPositive = 0;
		int countNegative = 0;
		int countZero = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				positiveSum = positiveSum + arr[i];
				countPositive++;
			} else if (arr[i] < 0) {
				countNegative++;
			} else {
				countZero++;
			}

		}

		System.out.println("The bigger=st value of array is: " + max);
		System.out.println("The sum of positive values is: " + positiveSum);
		System.out.println("The amount of negative numbers is equal to " + countNegative);
		if (countZero > 0) {
			System.out.println("The amount of values egual to 0 is: " + countZero);
		}

		if (countPositive > countNegative) {
			System.out.println("There are more positive values.");
		} else {
			System.out.println("There are more negative values.");
		}

		/** practical task 2 */

		Employees[] emp = new Employees[5];

		String name;
		int departmentNumber;
		double salary;

		for (int i = 0; i < emp.length; i++) {
			System.out.print("\nEnter Employee name = ");
			name = sc.nextLine();
			System.out.print("Enter Employee departmentNumber = ");
			departmentNumber = Integer.parseInt(sc.nextLine());
			System.out.print("Enter Employee salary = ");
			salary = Double.parseDouble(sc.nextLine());
			emp[i] = new Employees(name, departmentNumber, salary);
		}
		// System.out.println(count); Veryfy : Is constructor working?

		System.out.println("Enter certain number of department:");
		int certainNumberOfDep = Integer.parseInt(sc.nextLine());
		for (Employees currenEmployee : emp) {
			if (currenEmployee.getDepartmentNumber() == certainNumberOfDep) {
				System.out.println(currenEmployee.toString());
			}
		}
		
		Employees tmp;
		for (int i = 0; i < emp.length - 1; i++) {
			for (int j = 0; j < emp.length - 1 - i; j++) {
				if (emp[j].getSalary() < emp[j + 1].getSalary()) {
					tmp = emp[j];
					emp[j] = emp[j + 1];
					emp[j + 1] = tmp;
				}
			}
		}
		System.out.println("\nsorted Employees:\n" + emp.toString());
	}
	
	

	public static int count = 0;
	private String name;
	private int departmentNumber;
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employees(String name, int departmentNumber, double salary) {
		this.name = name;
		this.departmentNumber = departmentNumber;
		this.salary = salary;
		count++;
	}

	public Employees(String name) {
		this.name = name;
	}

	public Employees() {

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + departmentNumber;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Employees other = (Employees) obj;
		if (departmentNumber != other.departmentNumber)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employees [name=" + name + ", departmentNumber=" + departmentNumber + ", salary=" + salary + "]";
	}

}

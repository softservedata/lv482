package com.softserve.edu.inheritance.hw;

import java.util.Arrays;
import java.util.Comparator;

interface IPay { //extends Comparable<IPay> {
	double calculatePay();
}

abstract class Employee implements IPay, Comparable<Employee> {

	public static class EmployeeSort implements Comparator<Employee> {
		public int compare(Employee emp1, Employee emp2) {
			long o1 = emp1.getId();
			long o2 = emp2.getId();
			return o1 < o2 ? -1 : o1 > o2 ? 1 : 0;
		}
	}

	public static class EmployeeSortName implements Comparator<Employee> {
		public int compare(Employee emp1, Employee emp2) {
			return emp1.getName().compareTo(emp2.getName());
		}
	}

	
	private long id;
	private String name;

	public Employee(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Employee employee) {
		double o1 = calculatePay(); // this.calculatePay();
		double o2 = employee.calculatePay();
		//return o1 < o2 ? -1 : o1 > o2 ? 1 : 0; 
		return o1 < o2 ? 1 : o1 > o2 ? -1 : 0;
	}
	
}

class ContractEmployee extends Employee {
	private String federalTaxIdmember;
	private int days;

	public ContractEmployee(long id, String name, int days, String federalTaxIdmember) {
		super(id, name);
		this.federalTaxIdmember = federalTaxIdmember;
		this.days = days;
	}

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	@Override
	public double calculatePay() {
		return days * 1000;
	}

	@Override
	public String toString() {
		return "ContractEmployee [ "
				+ super.toString()
				+ ", federalTaxIdmember=" + federalTaxIdmember 
				+ ", days=" + days + "]";
	}
	
}

class SalariedEmployee extends Employee {
	private String socialSecurityNumber;

	public SalariedEmployee(long id, String name, String socialSecurityNumber) {
		super(id, name);
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public double calculatePay() {
		return 20000;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [ " 
				+ super.toString() 
				+ ", socialSecurityNumber=" 
				+ socialSecurityNumber + "]";
	}

}

class DoubleSortDesc implements Comparator<Double> {
	private final int MAX_PRECOSION = 10;

	public int compare(Double o1, Double o2) {
		/*
		double currnet = o2 - o1;
		int i = 0;
		while ((Math.abs(currnet) < 1) && (i < MAX_PRECOSION)) {
			currnet = currnet * 10;
			i++;
		}
		return (int) (currnet);
		*/
		//return o1 < o2 ? -1 : o1 > o2 ? 1 : 0;
		return o1 < o2 ? 1 : o1 > o2 ? -1 : 0;
	}
}

/*-
class EmployeeSort implements Comparator<Employee> {
	public int compare(Employee emp1, Employee emp2) {
		long o1 = emp1.getId();
		long o2 = emp2.getId();
		return o1 < o2 ? -1 : o1 > o2 ? 1 : 0;
	}
}
*/

public class HomeWork2 {
	public static void main(String[] args) {
		/*-
		//double[] arr = { 12, 10, 0, 1, 8, 5, -4, 15.007, 15.001, 20, 16, 11, 17 };
		Double[] arr = { new Double(12), new Double(10), new Double(0),
				new Double(1), new Double(8), new Double(5), new Double(-4),
				new Double(15.007), new Double(15.001), new Double(20),
				new Double(16), new Double(11), new Double(17) };
		//System.out.println("Orinal arr: " + arr);
		System.out.println("Orinal arr: " + Arrays.toString(arr));
		//Arrays.sort(arr); // By Asc
		Arrays.sort(arr, new DoubleSortDesc()); // By Desc
		System.out.println("Sorted arr: " + Arrays.toString(arr));
		*/
		//
		/*
		IPay[] emps = { new ContractEmployee(17L, "Ivan", 17, "FEDERAL123457896"),
		        new SalariedEmployee(14L, "Ira", "SOCIALNUMBER13579"),
		        new SalariedEmployee(15L, "Kira", "SOCIALNUMBER86431"),
		        new ContractEmployee(12L, "Petro", 15, "FEDERAL987654321") };
		*/
		Employee[] emps = { new ContractEmployee(17L, "Ivan", 17, "FEDERAL123457896"),
				           new SalariedEmployee(14L, "Ira", "SOCIALNUMBER13579"),
				           new SalariedEmployee(15L, "Kira", "SOCIALNUMBER86431"),
				           new ContractEmployee(12L, "Petro", 15, "FEDERAL987654321") };
		System.out.println("Originsl Array:");
		for (IPay currentEmp : emps) {
			System.out.println(currentEmp);
			System.out.println("\t\tcalculatePay = " + currentEmp.calculatePay());
		}
		//Arrays.sort(emps);
		//Arrays.sort(emps, new Employee.EmployeeSort());
		Arrays.sort(emps, new Employee.EmployeeSortName());
		//Arrays.sort(emps, new EmployeeSort());
		//System.out.println("Sorted arr: " + Arrays.toString(emps));
		System.out.println("Sorted Array:");
		for (IPay currentEmp : emps) {
			System.out.println(currentEmp);
			System.out.println("\t\tcalculatePay = " + currentEmp.calculatePay());
		}
	}
	
}

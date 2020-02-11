package com.softserve.edu;

public class SalariedEmployee extends EmployeeOOP2 implements EmployeeCalculate {

	private String socialSecurityNumber;
	private double rate;
	private int dayOff;

	public SalariedEmployee(String name, Position position, String employeeld, 
			double rate, int dayOff) {
		this.name = name;
		this.position = position;
		this.employeeld = employeeld;
		this.rate = rate;
		this.dayOff = dayOff;

	}

	@Override
	public double calculatePay() {
		salary = rate -( rate /30 * dayOff);
		return salary;
	}

	void input() {
		calculatePay();
		System.out.println("The " + name + "s position is " + position + ". The salary =" + salary);

	}
}

package com.softserve.edu;

public class ContractEmployee extends EmployeeOOP2 implements EmployeeCalculate {

	private String federalTaxIdmember;
	private double hourCost;
	private double workHours;

	public ContractEmployee(String name, Position position, String employeeld, 
			double hourCost, double workHours) {
		this.name = name;
		this.position=position;
		this.employeeld=employeeld;
		this.workHours= workHours;
		this.hourCost=hourCost;
		
	}

	@Override
	public double calculatePay() {
		salary = hourCost * workHours;
		return salary;
	}

	@Override
	void input() {
		calculatePay();
		System.out.println("The " + name + "s position is " + position + ". The salary =" + salary);

	}

}

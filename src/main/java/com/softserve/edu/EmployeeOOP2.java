package com.softserve.edu;

import java.util.Arrays;

public abstract  class EmployeeOOP2 {

	public String name;
	Position position;
	public double salary;
	
	public String employeeld;
	
	abstract void input();
	
	public static void main(String [] args) {
		 EmployeeOOP2 []  employees = {new ContractEmployee("Joe", Position.Teacher, "0012", 
					40, 168), new ContractEmployee("Jack", Position.Doctor, "0022", 
					60, 152), new SalariedEmployee("Ola", Position.Accountant, "0055", 
									9000, 1) };
		 
		
		/* for (int i = 0; i <employees.length - 1; i++) {
				for (int j = 0; j < employees.length - 1 - i; j++) {
					if (employees[j].salary <employees[j + 1].salary) {
						tmp= employees[j];
						employees[j] = employees[j + 1];
						employees[j + 1] = tmp;
					}
					
				}
		 }*/
		 
		 for(EmployeeOOP2 current : employees) {
			 current.input();
			 
		 }
	}
}

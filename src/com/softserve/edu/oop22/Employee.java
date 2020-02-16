package com.softserve.edu.oop22;

public class Employee implements Interface {
    String employeeld;
    int hourlyPaid = 100;
    @Override
    public Object calculatrPay() {
        SalariedEmployee salariedEmployee = new SalariedEmployee();
        int salsry =salariedEmployee.hourlyPaidSE * salariedEmployee.hour;
        System.out.print("Salary ");
        ContractEmployee contractEmployee = new ContractEmployee();
        int salary = contractEmployee.hourlyPaidCE * contractEmployee.hour;
        return salsry + " Salary contrakt: " + salary;
    }
}



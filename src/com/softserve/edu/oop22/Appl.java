package com.softserve.edu.oop22;

import java.util.Arrays;

public class Appl {

    public static void main(String[] args) {
        Object[][] employee = new Object[3][];
        employee[0] = new String[5];
        employee[0][0] = "Ivan";
        employee[0][1] = "Petro";
        employee[0][2] = "Vasya";
        employee[0][3] = "Masha";
        employee[0][4] = "Vira";
    /*    employee[1] = new String[5];
        employee[1][0] = 100;
        employee[1][1] = 103;
        employee[1][2] = 130;
        employee[1][3] = 130;
        employee[1][4] = 112;
    */    Employee emp = new Employee();
        emp.employeeld = Arrays.toString(employee);
        System.out.println(Arrays.toString(employee));
        Object info = emp.calculatrPay();
        System.out.println(info);
    }
}

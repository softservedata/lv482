/*
package com.softserve.edu.oop22;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class Employee implements Interface{
//    public static class EmployeeSort implements Comparator<Employee> {
//        public int compare(Employee emp1, Employee emp2) {
//            int o1 = emp1.hourlyPaid;
//            int o2 = emp2.employeeld;
//            return o1 < o2 ? -1 : o1 > o2 ? 1 : 0;
//        }

        @Override
        public Comparator<Employee> reversed() {
            return null;
        }

        @Override
        public Comparator<Employee> thenComparing(Comparator<? super Employee> other) {
            return null;
        }

        @Override
        public <U> Comparator<Employee> thenComparing(Function<? super Employee, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
            return null;
        }

        @Override
        public Comparator<Employee> thenComparingDouble(ToDoubleFunction<? super Employee> keyExtractor) {
            return null;
        }

    int employeeld = 500;
    String hourlyPaid = 100;
    String name;
//    public Employee1(String name,int hourlyPaid){
//        this.name=name;
//        this.hourlyPaid=hourlyPaid;
//    }

    public Employee(String name, String hourlyPaid) {
        this.name = name;
        this.hourlyPaid = hourlyPaid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeld='" + employeeld + '\'' +
                ", hourlyPaid=" + hourlyPaid +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public Object calculatrPay() {
        return hourlyPaid;
    }

    public int hourlyPaid() {
        return hourlyPaid;
    }


}


*/

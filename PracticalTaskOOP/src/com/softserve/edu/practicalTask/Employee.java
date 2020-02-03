package com.softserve.edu.practicalTask;

public class Employee {
	private  String name;
	private double rate;
	private double hours;
	private static double totalSum;
	static {
		totalSum=0.0;
	}	
	public Employee() {
		name="";
		rate=0.0;
		hours=0.0;
	}
	public Employee(String name, double rate) {
		this.name=name;
		this.rate=rate;
	}
	public Employee(String name, double rate, double hours) {
		this.name=name;
		this.rate=rate;
		this.hours=hours;
		totalSum=totalSum+rate*hours;
	}
	public double getSalary() {
		return rate*hours;
	}
	@Override
	public String toString() {
		return "Name= "+name+" rate= "+rate+" hours= "+hours+" salary= "+getSalary()+" bonuses= "+getBonuses();
	}
	public void changeRate(double rate) {
		totalSum=totalSum-getSalary();
		this.rate=rate;
		totalSum=totalSum+getSalary();
	}
	public double getBonuses() {
		return getSalary()*10/100;
	}
	public double getTotalSum() {
		return totalSum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	

}

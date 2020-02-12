package com.softserve.edu.homeworkTask4;

public class Car{

	private int year;
	private int capacity;
	
	public Car(){
		year=0;
		capacity=0;
	}
	public Car(int year, int capacity){
		this.year=year;
		this.capacity=capacity;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "year = ["+getYear()+"] capacity =["+getCapacity()+"]";
		
	}
	
}

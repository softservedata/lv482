package com.softserve.edu.practicalTask1;

public class Main {
	public static void main(String[] args) {
		int[] arr= {1,-5,-6,-3,8,-15,2,3,4,10};
		int max=arr[0];
		int sum=0;
		int amountOfNegative=0;
		int amountOfPositive=0;
		for(int i:arr) {
			if(i>max) {
				max=i;
			}
			if(i>0) {
				sum=sum+i;
				amountOfPositive++;
			} 
			if(i<0) {
				amountOfNegative++;
			}
		}
		System.out.println("Max = "+max);
		System.out.println("Sum = "+sum);
		System.out.println("Amount of negative = "+amountOfNegative);
		System.out.println(amountOfPositive > amountOfNegative ? "More POSITIVE values ":"More NEGATIVE values ");
	}
}

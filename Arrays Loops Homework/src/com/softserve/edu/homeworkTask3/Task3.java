package com.softserve.edu.homeworkTask3;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
	
		
		int[] arr = {-1,-2,3,6,6};
		int[] positiveArray=new int[5];
		int min=arr[0];
		int position=0;
		int counter=0;
		int secondPositive=0;
		int positionOfSecondPositive=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				position=i;
			}
			if(arr[i]>0 && counter<2) {
				secondPositive=arr[i];
				positionOfSecondPositive=i;
				counter++;
			}
		}
		System.out.println("min = "+min);
		System.out.println("pos = "+position);
		System.out.println("second positive ="+secondPositive);
		System.out.println("pos of second positive = "+positionOfSecondPositive);
		
		System.out.println("------------------Second part-----------------------");
		//
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size= sc.nextInt();
		int[] array=new int[size];
		int x=0;
		int i=0;
		int prod=1;
		System.out.println("Enter integers numbers until the first negative number");
		do {
			if(i>=size) {
				System.out.println("you are out of size, you can't enter more numbers");
				break;
			}
			System.out.println("enter integer");
			x=sc.nextInt();
			array[i]=x;
			i++;
		}while(x>0);
		for(int j:array) {
			if(j!=0) {
				prod=prod*j;
			}
		}
		System.out.println("prod ="+prod);
		
	}
}

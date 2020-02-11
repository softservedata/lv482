package com.softserve.edu.howeworkTask2;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
//		System.out.println("Enter size of array of int numbers");
		Scanner sc=new Scanner(System.in);
//		int size=sc.nextInt();
		int[] array = new int[10];
		int j=0;
		do {
			System.out.println("Enter integer number : ");
			array[j]=sc.nextInt();
			j++;
		}while(j<array.length);
		
		int sum=0;
		int prod=1;
		boolean key=true;
		
			for(int k=0;k<5;k++) {
				if(array[k]<0) {
					key=false;
					break;
				}
			}
			if(key) {
				for(int i : array) {
					sum=sum+i;
				}
				System.out.println("Sum ="+sum);
			}else {
				for(int i : array) {
					prod=prod*i;
				}
				System.out.println("Prod= "+prod);
				
			}
			
		}
	

}

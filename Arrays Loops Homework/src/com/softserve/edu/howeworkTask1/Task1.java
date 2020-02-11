package com.softserve.edu.howeworkTask1;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		int monthDays[ ]  = {31, 28, 31, 30, 31, 30, 
				31, 31, 30, 31, 30, 31} ;
		System.out.println("Enter number of mounth");
		Scanner sc=new Scanner(System.in);
		int numberOfMonth=sc.nextInt();
		System.out.println(monthDays[numberOfMonth-1]);
		sc.close();

	}

}

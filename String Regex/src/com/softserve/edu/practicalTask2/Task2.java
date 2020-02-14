package com.softserve.edu.practicalTask2;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
	
		String[] dataArr=splitString(enterData());
		System.out.println("surname and initials: "+dataArr[1]+" "+dataArr[0].toUpperCase().charAt(0)+". "+dataArr[2].toUpperCase().charAt(0)+"." );
		System.out.println("name: "+dataArr[0]);
		System.out.println("name, middle name, last name: "+dataArr[0]+" "+dataArr[1]+" "+dataArr[2]);
		
	}
	public static String enterData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name: ");
		String name=sc.nextLine();
		System.out.println("enter surname: ");
		String surname=sc.nextLine();
		System.out.println("enter patronymic: ");
		String patronymic=sc.nextLine();
		sc.close();
		
		return name+" "+surname+" "+patronymic;

	}
	public static String[] splitString(String s) {
		return s.split(" ");
	}

}

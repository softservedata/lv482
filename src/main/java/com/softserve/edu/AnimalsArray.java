package com.softserve.edu;

import java.util.Scanner;

public class AnimalsArray {
	
	public static void main (String[] args) {
		
		System.out.println("Enter how many animals do you have?");
		try {
			Scanner sc = new Scanner(System.in);
			int n = Integer.parseInt(sc.nextLine());
			Animals[] animals = new Animals[n];
			
			String name;
			
			for(int i = 0; i< n; i++) {
				if(i % 2 < 1) {
					System.out.println("\nEnter name:");
					 name = sc.nextLine();
					 animals[i] = new Cats(name);
					 }
				else {
					System.out.println("\nEnter name:");
					 name = sc.nextLine();
					 animals[i] = (Animals) new Dogs(name);
				}
			}
			
			for (Animals current : animals) {
				System.out.println("\nThis is " + current.toString() );
				current.feed();
				current.voice();
			}
			
		}
		catch (Exception e){
			System.out.println("Enter corect value");
		}
	}
}

package com.softserve.edu;

import java.io.IOException;
import java.util.Scanner;

public class Flowerbed {

	public static void main(String[] args) throws IOException {
		
/* 
 * task 1 about perimeter & area of flower bed
 */	
		System.out.println("Radius of flower bed =");
		Scanner sc = new Scanner(System.in);
		
		int radius = sc.nextInt();
		System.out.println("Radius of the flower bed = " + (2*3.14*radius));
		System.out.println("Area of the flower bed = " +  + (3.14*radius*radius));
		
// task 2 
		Scanner scc = new Scanner(System.in);
		
		System.out.println("What is your name?" );
		String name = scc.nextLine();
		System.out.println("Where are you live, " + name);
		String adress = scc.nextLine();
		System.out.println(name + " you live in " + adress);
	
/*
 * task 3
 */
		System.out.println("t1 = ");
		int t1 = scc.nextInt();
		System.out.println("t2 = ");
		int t2 = scc.nextInt();
		System.out.println("t3 = ");
		int t3 = scc.nextInt();
		
		System.out.println("c1 = ");
		int c1 = scc.nextInt();
		System.out.println("c2 = ");
		int c2 = scc.nextInt();
		System.out.println("c3 = ");
		int c3 = scc.nextInt();
		
		scc.close();
		
		System.out.println("first call costs : " + (c1*t1));
		System.out.println("second call costs : " + (c2*t2));
		System.out.println("third  call costs : " + (c3*t3));
		
		System.out.println("general price is : " + (c1*t1 + c2*t2 + c3*t3 ));
		
		
	}

}

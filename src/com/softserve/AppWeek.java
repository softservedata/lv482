package com.softserve;

import java.util.Scanner;

enum Weeks {
	SUNDAY("Sunday"),
	MONDAY("Monday"),
	TUESDAY("Tuesday"),
	WEDNESDAY("Wednesday"),
	THURSDAY("Thursday"),
	FRIDAY("Friday"),
	SATURDAY("Saturday");
	
	private String day;

	private Weeks(String day) {
		this.day = day;
	}
	
	@Override
	public String toString() {
		return day;
	} 
	
}

public class AppWeek {
	
	public static void main(String[] args) {
		System.out.print("Enter day number: ");
		Scanner scanner = new Scanner(System.in); 
		int myDay = scanner.nextInt();
		if ((myDay < 0) || (myDay > 6)) {
			System.out.println("Invalid parameter, myDay = " + myDay);
			System.exit(1);
		}
		/*-
		Weeks weeks = Weeks.SUNDAY;
		switch (myDay) {
		case 0: weeks = Weeks.SUNDAY; break;
		case 1: weeks = Weeks.MONDAY; break;
		case 2: weeks = Weeks.TUESDAY; break;
		case 3: weeks = Weeks.WEDNESDAY; break;
		case 4: weeks = Weeks.THURSDAY; break;
		case 5: weeks = Weeks.FRIDAY; break;
		case 6: weeks = Weeks.SATURDAY; break;
		default: weeks = Weeks.SUNDAY;
		}
		*/
		Weeks weeks = Weeks.values()[myDay];
		System.out.println("Current day is " + weeks);
	}

}

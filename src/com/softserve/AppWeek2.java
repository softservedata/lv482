package com.softserve;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

enum Language {
	English,
	Ukraine;
}

enum LanguageWeeks {
	SUNDAY("Sunday", "Неділя"),
	MONDAY("Monday", ""),
	TUESDAY("Tuesday", ""),
	WEDNESDAY("Wednesday", ""),
	THURSDAY("Thursday", ""),
	FRIDAY("Friday", ""),
	SATURDAY("Saturday", "");
	
	private Map<Language, String> day;

	private LanguageWeeks(String... day) {
//		day = new HashMap<Language, String>();
//		int i = 0;
//		for (Language currentLanguage : Language.values()) {
//			day.a
//		}
	}
	
	@Override
	public String toString() {
		return "";
	} 
	
}

public class AppWeek2 {
	
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

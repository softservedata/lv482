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
	MONDAY("Monday", "Понеділок"),
	TUESDAY("Tuesday", "Вівторок"),
	WEDNESDAY("Wednesday", "Середа"),
	THURSDAY("Thursday", "Червер"),
	FRIDAY("Friday", "П'ятниця"),
	SATURDAY("Saturday", "Субота");
	
	private Map<Language, String> dayName;

	private LanguageWeeks(String... day) {
		dayName = new HashMap<>();
		int i = 0;
		for (Language currentLanguage : Language.values()) {
			try {
				if ((day[i] == null) || (day[i].length() == 0)) {
					throw new IllegalArgumentException("Invalid Argument or Parameter not Found for Language: " + currentLanguage.name());
				}
			} catch(ExceptionInInitializerError | ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
				throw new IllegalArgumentException("***Invalid Argument or Parameter not Found for Language: " + currentLanguage.name());				
			}
			dayName.put(currentLanguage, day[i]);
			i++;
		}
	}
	
	public String getWeekDay(Language language) {
		return dayName.get(language);
	}
	
	@Override
	public String toString() {
		return dayName.toString();
	} 
	
}

public class AppWeek2 {
	
	public static void main(String[] args) throws InterruptedException {
		String scLang = "English";
		Language language = Language.English;
		int myDay = 0;
		Scanner scanner = new Scanner(System.in);
		//
		System.out.print("Enter Language: ");
		scLang = scanner.nextLine();
		try {
			language = Language.valueOf(scLang);
		} catch(IllegalArgumentException e) {
			boolean isThrowException = true;
			for (Language currentLanguage : Language.values()) {
				System.out.println("Attempt to use as: " + currentLanguage.name());
				Thread.sleep(1);
				//if (scLang.toLowerCase().contains(currentLanguage.name().toLowerCase())) {
				if ((scLang.length() > 2) && (scLang.substring(0, 3)
						.equalsIgnoreCase(currentLanguage.name().substring(0, 3)))) {
					language = currentLanguage;
					isThrowException = false;
					break;
				}
			}
			if (isThrowException) {
				throw new IllegalArgumentException("***Invalid Parameter", e);
			}
		}
		//
		do {
			System.out.print("Enter day number: ");
			myDay = scanner.nextInt();
			if ((myDay < 0) || (myDay > 6)) {
				System.out.println("Invalid parameter, myDay = " + myDay + "  Please, Repeat.");
				//System.exit(1);
			}
		} while ((myDay < 0) || (myDay > 6));
		//
		System.out.print("Current day is: ");
		System.out.println(LanguageWeeks.values()[myDay].getWeekDay(language));
		//System.out.println(LanguageWeeks.values()[myDay]);
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
		//Weeks weeks = Weeks.values()[myDay];
		//System.out.println("Current day is " + weeks);
		scanner.close();
	}

}

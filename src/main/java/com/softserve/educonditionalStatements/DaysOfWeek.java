package com.softserve.educonditionalStatements;

import java.time.DayOfWeek;
import java.util.Scanner;

/**Conditional Statements. Practical task2
 * 
 * Enter the number of the day of the week. Display the name in three languages.
 */

public enum DaysOfWeek {
	MONDAY ("monday", "poniedzialek", "понеділок"),
	TUESDAY ("tuesday", "wtorek", "вівторок"),
	WEDNESDAY ("wensday", "sroda", "середа"),
	THURSTDAY("thursday", "czwartek", "четвер"),
	FRIDAY ("friday", "piatek", "пятниця"),
	SATURDAY("saturday", "sobota", "субота"), 
	SUNDAY("sanday", "niedzielia", "неділя");
	
	public static void main(String[] args) {
		
		System.out.println("\nEnter the  number of day :");
		Scanner sc = new Scanner(System.in);
		try{
			int dayOfWeek = Integer.parseInt(sc.nextLine());
			switch(dayOfWeek) {
			case 1: System.out.println(MONDAY.getEn());
					System.out.println(MONDAY.getPl());
					System.out.println(MONDAY.getUa());
					break;
			case 2: System.out.println(TUESDAY.getEn());
					System.out.println(TUESDAY.getPl());
					System.out.println(TUESDAY.getUa());
					break;
			case 3: System.out.println(WEDNESDAY.getEn());
					System.out.println(WEDNESDAY.getPl());
					System.out.println(WEDNESDAY.getUa());
					break;
			case 4: System.out.println(TUESDAY.getEn());
					System.out.println(TUESDAY.getPl());
					System.out.println(TUESDAY.getUa());
					break;
			case 5: System.out.println(FRIDAY.getEn());
					System.out.println(FRIDAY.getPl());
					System.out.println(FRIDAY.getUa());
					break;
			case 6: System.out.println(SATURDAY.getEn());
					System.out.println(SATURDAY.getPl());
					System.out.println(SATURDAY.getUa());
					break;
			case 7: System.out.println(SUNDAY.getEn());
					System.out.println(SUNDAY.getPl());
					System.out.println(SUNDAY.getUa());
					break;
			default:System.out.println("No this day");
			
			}
			
		}
		catch(Exception e) {
			System.out.println("Invalid number. Try one more time.");
		}
	}
	
	private final String en;
	private final String pl;
	private final String ua;
	

	DaysOfWeek(String en, String pl, String ua) {
		this.en = en;
		this.pl = pl;
		this.ua = ua;
	}


	public String getEn() {
		return en;
	}


	public String getPl() {
		return pl;
	}


	public String getUa() {
		return ua;
	}
	
	
	
	
	

}

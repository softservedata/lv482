package com.softserve.educonditionalStatements;

import java.util.Scanner;

/**
 * Conditional Statements. Practical task3
 * Enter the name of the country. Print the name of the continent. 
 * (Declare enum with names of continents)
 * @author Kristina
 *
 */

enum NameOfContinent { EUROPA, ASIA, SOUTH_AMERICA, NORTH_AMERIKA, AFRICA, AUSTRALIA;}

public enum NameOfCountry{ UKRAINA, POLAND, GERMAN, FRANCE, ITALY, MONACO, INDIA, TURKEY, GERGIA,
	 TAILAND, PERU, BRASILIA, KOLUMBIA, CHILY, EGYPT, TUNIS, MARAKESH, THE_USA, CANADA, MEXICO,
	 ASTRALIA;
	 
	
	public static void main(String[] args) {
		System.out.println("Enter the  country:");
		Scanner sc = new Scanner(System.in);
		try {
		String nameOfCountry = sc.nextLine();
		NameOfContinent nameOfContinent; 
		switch(nameOfCountry.toUpperCase()) {
		case "UKRAINA": case "POLAND":case "GERMAN":case "FRANCE": case "ITALY": case "MONACO": 
			nameOfContinent = NameOfContinent.EUROPA;
			System.out.println(nameOfContinent);
			break;
		case "INDIA": case "TURKEY": case "GERGIA": case "TAILAND" :
			nameOfContinent = NameOfContinent.ASIA;
			System.out.println(nameOfContinent);
			break;
		case "PERU": case "BRASILIA": case "KOLUMBIA":case "CHILY": case "EGYPT" :case "TUNIS" :case "MARAKESH":
			nameOfContinent = NameOfContinent.SOUTH_AMERICA;
			System.out.println(nameOfContinent);
			break;
		case "THE_USA" : case "CANADA" : case  "MEXICO":
			nameOfContinent = NameOfContinent.NORTH_AMERIKA;
			System.out.println(nameOfContinent);
			break;
		case "ASTRALIA":
			nameOfContinent = NameOfContinent.AUSTRALIA;
			System.out.println(nameOfContinent);
			break;
		default :
			System.out.println("Are You from Antarctida?");
		}
		}
		catch(Exception e) {
			System.out.println("Something went wrong!");
		}
	
		
	
	}
}
package com.softserve.edu.condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Student {
	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Student other = (Student) obj;
		if (age != other.age) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}
	
	
	
}


class A {
}

public class Appl {

//	public enum Sesons {
//		WINTER, SPRING, SUMMER, AUTUMN
//	}

	public enum Localization {
		EN("àíãë³éñüêà", "English"),
		UA("óêğà¿íñüêà", "Ukrainian");

		private final String ua;
		private final String en;

		Localization(String ua, String en) {
			this.ua = ua;
			this.en = en;
		}

		public String getUa() {
			return ua;
		}

		public String getEn() {
			return en;
		}
	}

	
	public enum Sesons {
		WINTER("winter") { public Sesons nextSeason() {return SPRING; }},
		SPRING("spring") { public Sesons nextSeason() {return SUMMER; }},
		SUMMER("summer") { public Sesons nextSeason() {return AUTUMN; }},
		AUTUMN("autumn") { public Sesons nextSeason() {return WINTER; }};
		
		private String season;
		
		private Sesons(String season) {
			this.season = season;
		}
		
//		@Override
//		public String toString() {
//			return season + "_";
//		}
		
		public abstract Sesons nextSeason();
	}

	
	public static Sesons nextSeason(Sesons s) {
		if (s == Sesons.WINTER) {
			return Sesons.SPRING;
		}
		if (s == Sesons.SPRING) {
			return Sesons.SUMMER;
		}
		if (s == Sesons.SUMMER) {
			return Sesons.AUTUMN;
		}
		return Sesons.WINTER;
	}

	
	public static void main(String[] args) throws IOException {
		/*-
		int x = 11;
		int y = 7;
		System.out.println("x= " + x + " y= " + y);
		//
		int a = x + y; // a = 18
		System.out.println("a= " + a);
		int s = x - y; // s = 4
		System.out.println("s= " + s);
		int m = x * y; // m = 77
		System.out.println("m= " + m);
		//
		int d = x / y; // d = 1
		System.out.println("d= " + d);
		int r = x % y; // r = 4
		System.out.println("r= " + r);
		//
		double d2 = x / y; // d2 = 1.0
		System.out.println("d2= " + d2);
		double d3 = ((double) x) / y; // d3 = 1.57
		System.out.println("d3= " + d3);
		//
		*/
		//
		/*-
		int x = 5;
		int a, b;
		// a = (b = x + 1) + 2;
		// System.out.println("a= " + a + " b= " + b);
		//
		a = x++; // a = 5 x = 6
		System.out.println("a= " + a + " x= " + x);
		x--; // x = 5
		b = ++x; // b = 6 x = 6
		System.out.println("b= " + b + " x= " + x);
		a = b++ + x;
		System.out.println("a= " + a + " b= " + b + " x= " + x);
		++x; // x = 7
		//
		boolean bool = true;
		// true
		System.out.println(bool);
		// false
		System.out.println(!bool);
		//
		double d = 1;
		d++;
		System.out.println("d= " + d);
		//
		*/
		//
		/*-
		int x = 5;
		int y = -5;
		boolean b = x > y;
		if (x > y) {
			b = true;
		} else {
			b = false;
		}
		System.out.println("b= " + b); // true
		System.out.println(x == y); // false
		System.out.println(x != y); // true
		System.out.println(x >= y); // true
		*/
		//
		/*-
		// true = 1; false = 0;  && = multiply;  || = add;
		int t = 5, s = 4, v = 7;
		System.out.println(  ((t > s) && (t > v)) || (s < v)  );  // true
		//                      t=1         f=0         t=1
		//                             f=0         t=1
		System.out.println(  ((t < v) || (s > v)) && (t < s)  );  // false
		//                      t=1         f=0         f=0
		//                             t=1         f=0
		*/
		//
		/*-
		int a = 5;		// 0000 0000 0000 0000 0000 0000 0000 0101 = 5
		int b = 6;		// 0000 0000 0000 0000 0000 0000 0000 0110 = 6
		int c;
		c = a | b;		// 0000 0000 0000 0000 0000 0000 0000 0111 = 7
		System.out.println("c = a | b : " + c);
		c = a & b;		// 0000 0000 0000 0000 0000 0000 0000 0100 = 4
		System.out.println("c = a & b : " + c);
		*/
		//
		/*-
		int x = 5;
		int y = -5;
		// boolean b = x > y;
		boolean b = false;
		// if (x > y) {
		// b = true;
		// } else {
		// b = false;
		// }
		b = x > y ? true : (false || false) && true;
		System.out.println("b= " + b);
		//
		int t = 5, s = 4;
		String str1 = t >= ++s ? "yes" : "no";
		System.out.println("str1= " + str1);
		//
		*/
		//
		/*-
		int temperature = 11;
		if (temperature < 10) {
			System.out.println("It’s too cold");
		} else {
			System.out.println("It’s Ok");
		}
		//
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Do you enjoy Java? (yes/no/maybe): ");
		String input = br.readLine();
		//
		if ( input.equalsIgnoreCase("yes")  ) {
			System.out.println("Great!");
		} else if (  "no".equalsIgnoreCase(input)  ) {
			System.out.println("Too bad!");
		} else if (  "maybe".equalsIgnoreCase(input)  ) {
			System.out.println("Please, Love me!");
		} else {
			System.out.println("Wrong answer!");
		}
		//
		switch (input.toLowerCase()) {
		case "ja":
		case "yes":
			System.out.println("Great!");
			break;
		case "no":
			System.out.println("Too bad!");
			break;
		case "maybe":
			System.out.println("Please, Love me!");
			break;
		default:
			System.out.println("Wrong answer!");
		}
		*/
		//
		/*-
		Sesons myLove = Sesons.SUMMER;
		for (Sesons current : Sesons.values()) {
			System.out.println("current = " + current);  // current.toString();
			// System.out.println("current as int = " + current.ordinal());
		}
		//
		String name = "WINTER";
		//String name = "WIN"; // Runtime Error
		Sesons s1 = Sesons.valueOf(name);
		System.out.println(" s1 = " + s1);
		int i2 = 2;
		Sesons s2 = Sesons.values()[i2];
		System.out.println(" s2 = " + s2);
		//
		String month = "February";
		Sesons sesons = Sesons.SUMMER;
		switch (month) {
		case "Deñember":
		case "January":
		case "February":
			sesons = Sesons.WINTER;
			break;
		case "Marth":
		case "April":
		case "May":
			sesons = Sesons.SPRING;
			break;
		case "June":
		case "Jule":
		case "August":
			sesons = Sesons.SUMMER;
			break;
		case "September":
		case "October":
		case "November":
			sesons = Sesons.AUTUMN;
			break;
		default:
			System.out.println("No this month");
			System.exit(0);
		}
		System.out.println("Current season is : " + sesons);
		System.out.println("Next season is : " + nextSeason(sesons) );
		System.out.println("Next season is : " + sesons.nextSeason() );
		//
		Localization localization = Localization.EN;
		System.out.println(localization.getEn());
		System.out.println(localization.getUa());
		//
		*/
		//
		Student student1 = new Student("Ira", 25);
		Student student2 = new Student("Ira", 25);
		//System.out.println("student1 == student2 : " + (student1 == student2));
		System.out.println("student1.equals(student2) : " + student1.equals(student2));
	}
}

package com.softserve.edu.PracticalTask2;

public class Main {
	public static void main(String[] args) {
		Person[] arrayOfPersons = new Person[6];
		arrayOfPersons[0]=new Student("Adam");
		arrayOfPersons[1]=new Cleaner("Rob",3000);
		arrayOfPersons[2]=new Student("Dave");
		arrayOfPersons[3]=new Cleaner("Jack",3000);
		arrayOfPersons[4]=new Teacher("Bob",3500);
		arrayOfPersons[5]=new Student("Lance");
		
		for(Person person:arrayOfPersons) {
			System.out.println(person.print());
			if (person instanceof Staff) {
				System.out.println(((Staff) person).sallary());
			}
		}
	}

}

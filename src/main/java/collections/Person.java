package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Person {

	public static void main(String[] args) {

		List<Person> person = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter haw many person  are ");
		int many = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < many; i++) {
			System.out.println("Enter last name");
			String lastName = sc.nextLine();
			System.out.println("Enter name");
			String firstName = sc.nextLine();
			person.add(new Person(lastName, firstName));
		}
		System.out.println(person);

		Map<String, String> personMap = new HashMap<>();
		for (Person list : person) {
			personMap.put(list.getLastName(), list.getFirstName());
		}

		System.out.println("There is personMap " + personMap);

		System.out.println("Whom do you want to remowe ?");
		String chekName = sc.nextLine();

		Iterator<Map.Entry<String, String>> entryIterator = personMap.entrySet().iterator();
		while (entryIterator.hasNext()) {
			Map.Entry<String, String> entry = entryIterator.next();
			if (entry.getValue().equals(chekName)) {
				entryIterator.remove();
			}
		}
		System.out.println("There is personMap arter remove " + personMap);
	}

	@Override
	public String toString() {
		return "Person [lastName= " + lastName + ", firstName= " + firstName + "]";
	}

	private String lastName;
	private String firstName;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Person(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}

}

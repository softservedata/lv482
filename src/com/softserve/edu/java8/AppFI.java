package com.softserve.edu.java8;

import java.util.Arrays;
import java.util.List;

class Person {
	private String name;
	private Integer age;

	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public static int compareByName(Person a, Person b) {
		return a.name.compareTo(b.name);
	}

	public static int compareByAge(Person a, Person b) {
		return a.age.compareTo(b.age);
	}

}

class Person2 {
	private String name;

	public Person2() {
		name = "Ivan";
	}

	public Person2(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}

public class AppFI {
	public static void main(String[] args) {

		/*-
		List<String> names = Arrays.asList("Angela", "Aaron", "Bob", "Claire", "David");
		System.out.println("Origin: " + names);
		//Predicate<String> predicate1 = name -> true;
		//Predicate<String> predicate1 = name -> name.startsWith("A");
		//Predicate<String> predicate2 = s -> s.length() > 4;
		List<String> namesWithA = names
				.stream()
				//.filter(predicate1)
				//.filter(predicate2)
				.filter(name -> name.startsWith("A"))
				.collect(Collectors.toList());
		System.out.println("Updated: " + namesWithA);
		*/
		//
		/*-
		Function<String, Integer> stringToInt = x -> Integer.valueOf(x);
		System.out.println("2+3=" + (stringToInt.apply("2") + stringToInt.apply("3") ) );
		*/
		//
		/*-
		List<String> names = Arrays.asList("John", "Freddy", "Samuel");
		// Consumer<String> consumer1 = name -> System.out.println("Hello, " + name);
		// names.forEach(consumer1);
		names.forEach(name -> System.out.println("Hello, " + name));
		*/
		//
		/*-
		Supplier<Person> personSupplier = Person::new;
		System.out.println("Result: " + personSupplier.get().getName());
		*/
		//
		/*-
		List<String> names = Arrays.asList("bob", "josh", "megan");
		System.out.println("Origin: " + names);
		names.replaceAll(name -> name.toUpperCase());
		System.out.println("Updated: " + names);
		*/
		//
		/*-
		List<String> names = new ArrayList<>();
		names.add("Mahesh");
		names.add("Suresh");
		names.add("Ramesh");
		names.add("Naresh");
		names.add("Kalpesh");
		System.out.println("List:");
		names.forEach(System.out::println);
		*/
		//
		Person[] persons = { new Person("Ivan", 34), new Person("Vasyl", 29), new Person("Olga", 26),
				new Person("Anna", 41) };
		//
		System.out.println("Origin: " + Arrays.toString(persons));
//		Arrays.sort(persons, new Comparator<Person>() {
//			public int compare(Person o1, Person o2) {
//				return o1.getAge() - o2.getAge();
//			}
//		});
		//Arrays.sort(persons, (p1, p2) -> Person.compareByName(p1, p2));
		Arrays.sort(persons, Person::compareByAge);
		System.out.println("Sorted: " + Arrays.toString(persons));
		//
	}
}

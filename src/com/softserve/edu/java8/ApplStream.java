package com.softserve.edu.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ApplStream {
	public static void main(String[] args) {
		/*-
		//		Random random = new Random();
		//		random.ints().limit(10).forEach(System.out::println);
		//		random.ints().limit(10).sorted().forEach(System.out::println);
		*/
		//
		/*-
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		// get list of unique squares
		System.out.println("Origin: " + numbers);
		List<Integer> squaresList = numbers
				.stream()
				.map(i -> i * i)
				.distinct()
				.collect(Collectors.toList());
		System.out.println("Sqr: " + squaresList);
		*/
		//
		/*-
		List<String> strings = Arrays.asList("abc", "", "eg", "abcd", "", "jkl");
		long count = strings
				.stream()
				.filter(string -> string.isEmpty())
				.count();
		System.out.println("Count: " + count);
		strings
			.stream()
			.reduce((p1, p2) -> 
			p1.length() > p2.length() ? p1 : p2)
			.ifPresent(System.out::println);
		//
		Person[] persons = { new Person("Ivan", 3), new Person("Vasyl", 2),
				new Person("Olga", 2), new Person("Anna", 4) };
		List<Person> parents = Arrays.asList(persons);
		Integer ageSum = parents
				.stream()
		        .reduce(0, (sum, p) -> sum += p.getAge(), (sum1, sum2) -> sum1 + sum2);
		System.out.println(ageSum);
		Person pers = parents.stream()
		        .reduce(new Person("", 0), (p1, p2) -> 
		        	{  p1.setAge(p1.getAge() + p2.getAge()); p1.setName(p1.getName() + p2.getName()); return p1; });
		System.out.println("pers = " + pers);
		*/
		//
		/*-
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		Integer res = numbers.stream().reduce(0, (sum, p) -> sum = sum + p);
		System.out.println(res);
		*/
		//
		/*-
		List<String> strings = Arrays.asList("abc", "x", "bc", "eg", "abd", "", "jkl");
		//		List<String> filtered = strings
		//				//.stream()
		//				.parallelStream()
		//				.filter(str -> str.length() > 1)
		//				.collect(Collectors.toList());
		//		System.out.println("Filtered List: " + filtered);
		String mergedString = strings
				//.stream()
				.parallelStream()
				.filter(string -> !string.isEmpty())
				.collect(Collectors.joining(", "));
		System.out.println("Merged String: " + mergedString);
		*/
		//
		/*-
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		IntSummaryStatistics stats = numbers
				.stream()
				.mapToInt(x -> x)
				.summaryStatistics();
		System.out.println("Highest number in List : " + stats.getMax());
		System.out.println("Lowest number in List : " + stats.getMin());
		System.out.println("Sum of all numbers : " + stats.getSum());
		System.out.println("Average of all numbers : " + stats.getAverage());
		*/
		//
		List<Integer> numbers = new ArrayList<>(); 
		numbers.add(3);
		numbers.add(2);
		numbers.add(2);
		numbers.add(3);
		numbers.add(7);;
		numbers.add(3);
		numbers.add(5);
		System.out.println("Original numbers: " + numbers);
		Stream<Integer> nums = numbers
				.stream()
				.filter(n -> n > 2);
		numbers.set(1, 10);
		System.out.println("Updated numbers: " + numbers);
		System.out.println("nums count: " + nums.count());
	}
}

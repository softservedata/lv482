package com.softserve.generic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Hw1 {
	
	public <T> Set<T> union(Set<T> set1, Set<T> set2) {
		Set<T> result = new HashSet<>();
		result.addAll(set1);
		result.addAll(set2);
		return result;
	}
	
	public static void main(String[] args) {
		/*-
		String[] arr1 = { "1", "3", "7", "1", "7", "3", "8", "3", "2", "7" };
		String[] arr2 = { "3", "1", "7", "4", "8", "1", "7", "4", "3", "7" };
		Set<String> set1 = new HashSet<>(Arrays.asList(arr1));
		Set<String> set2 = new HashSet<>(Arrays.asList(arr2));
		//
		System.out.println("set1 = " + set1);
		System.out.println("set2 = " + set2);
		//
		Hw1 hw = new Hw1();
		System.out.println("union = " + hw.union(set1, set2));
		*/
		//
		/*-
		Integer[] arr1 = { 1, 3, 7, 1, 7, 3, 8, 3, 2, 7 };
		Integer[] arr2 = { 3, 1, 7, 4, 8, 1, 7, 4, 3, 7 };
		Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(arr2));
		//
		System.out.println("set1 = " + set1);
		System.out.println("set2 = " + set2);
		//
		Hw1 hw = new Hw1();
		System.out.println("union = " + hw.union(set1, set2));
		*/
		//
		Double[] arr1 = { 1.0, 3.2, 7.1, 1.0, 7.1, 3.2, 8.0, 3.2, 2.0, 7.1 };
		Double[] arr2 = { 3.2, 1.0, 7.1, 4.0, 8.0, 1.0, 7.1, 4.0, 3.2, 7.1 };
		Set<Double> set1 = new HashSet<>(Arrays.asList(arr1));
		Set<Double> set2 = new HashSet<>(Arrays.asList(arr2));
		//
		System.out.println("set1 = " + set1);
		System.out.println("set2 = " + set2);
		//
		Hw1 hw = new Hw1();
		System.out.println("union = " + hw.union(set1, set2));
		//
		/*-
		Set<String> set3 = new HashSet<>();
		set3.addAll(set1);
		set3.addAll(set2);
		System.out.println("(union) set3 = " + set3);
		//
		Set<String> set4 = new HashSet<>();
		set4.addAll(set1);
		set4.removeAll(set2);
		Set<String> set5 = new HashSet<>();
		set5.addAll(set2);
		set5.removeAll(set1);
		Set<String> set6 = new HashSet<>(set3);
		set6.removeAll(set4);
		set6.removeAll(set5);
		System.out.println("(intersect) set6 = " + set6);
		*/
		//
	}
}

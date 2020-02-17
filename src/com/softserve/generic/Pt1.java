package com.softserve.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Pt1 {
	public static void main(String[] args) {
		Integer[] arr = { 11, 21, 13, 14, 51, 61, 17, 18, 19, new Integer(91) };
		List<Integer> list = new ArrayList<>(Arrays.asList(arr));
		System.out.println("Original list = " + list);
		//
		List<Integer> list2 = new ArrayList<>();
		for (int i = 5; i < list.size(); i++) {
			list2.add(list.get(i));
		}
		System.out.println("new list2 = " + list2);
		//
		/*-
		List<Integer> list3 = new ArrayList<>(list);
		System.out.println("Original list3 = " + list3);
		Iterator<Integer> iterator = list3.iterator();
		while (iterator.hasNext()) {
			Integer element = iterator.next();
			if (element > 20) {
				iterator.remove();
			}
		}
		System.out.println("Updated list3 = " + list3);
		*/
		//
		List<Integer> list3 = new ArrayList<>(list);
		// System.out.println("Original list3 = " + list3);
		System.out.println("Original list3:");
		for (int k = 0; k < list3.size(); k++) {
			System.out.print("i=" + k + " val=" + list3.get(k) + "  ");
		}
		System.out.println();
		//int n = list3.size();
		//for (int i = 0; i < n; i++) {
		for (int i = 0; i < list3.size(); i++) {
			if (list3.get(i) > 20) {
				list3.remove(i);
				//i--;
				System.out.println("\tafter remove i=" + i + " list3:");
				for (int k = 0; k < list3.size(); k++) {
					System.out.print("i=" + k + " val=" + list3.get(k) + "  ");
				}
				System.out.println();
			}
		}
		// System.out.println("Updated list3 = " + list3);
		System.out.println("Updated list3:");
		for (int k = 0; k < list3.size(); k++) {
			System.out.print("i=" + k + " val=" + list3.get(k) + "  ");
		}
		System.out.println();
	}
}

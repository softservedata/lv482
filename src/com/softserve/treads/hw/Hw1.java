package com.softserve.treads.hw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Hw1 {
	public static void main(String[] args) {
		int count = 0;
		List<String> list = new ArrayList<>();
		String s = "";
		String fileName = "mytext.txt";
		System.out.println("Read data from file: " + fileName);
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			while ((s = br.readLine()) != null) {
				list.add(s);
				count++;
			}
		} catch (Exception e) {
			System.out.println("ERROR");
		}
		System.out.println("rows =  " + count);
		//
		String max = list.get(0);
		String min = list.get(0);
		for (String current : list) {
			if (max.length() < current.length()) {
				max = current;
			}
			if (min.length() > current.length()) {
				min = current;
			}
		}
		System.out.println("max = " + max + "   len = " + max.length());
		System.out.println("min = " + min + "   len = " + min.length());
		//
		System.out.println("Lines contains: var");
		for (String current : list) {
			if (current.contains("var")) {
				System.out.println(current);
			}
		}
	}
}

package com.softserve.str;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hw1 {
	public static void main(String[] args) {
		String text = "  text1,     first    money     second, text    US   currency  prise    ";
		String pattern = "[^ ]+";
		//
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		List<String> result = new ArrayList<>();
		//
		while (m.find()) {
			// System.out.print(text.substring(m.start(), m.end()) + "*");
			result.add(text.substring(m.start(), m.end()));
		}
		int maxlen = 0;
		int index = -1;
		for (int i = 0; i < result.size(); i++) {
			if (result.get(i).length() > maxlen) {
				maxlen = result.get(i).length();
				index = i;
			}
		}
		System.out.println("Origin List: " + result);
		System.out.println("maxlen = " + maxlen);
		System.out.println("Word: " + result.get(index));
		System.out.println("position: " + index);
		//
		for (String current : result) {
			String reserved = new StringBuilder(current).reverse().toString();
			System.out.println("Current word: " + current);
			System.out.println("Resersed word: " + reserved);
		}
	}
}

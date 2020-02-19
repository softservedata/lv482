package com.softserve.str;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hw3 {
	public static void main(String[] args) {
		String text = "text, text. Text money $111.10 second text US currency $3,221.22, prise is $567.32;";
		String pattern = "\\$(\\d{1,3}[,'])*\\d{1,3}\\.\\d{2}";
		//
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		List<Double> result = new ArrayList<>();
		//
		while (m.find()) {
			String first = text.substring(m.start(), m.end());
			result.add(Double.parseDouble(first.replaceAll(",|'|\\$", "")));
		}
		System.out.println("result = " + result);
	}
}

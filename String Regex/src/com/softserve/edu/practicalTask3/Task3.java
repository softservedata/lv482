package com.softserve.edu.practicalTask3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
	public static void main(String[] args) {
		String[] names= {"Kolya1233424","petyasadsadsad9999999","vasya129","bob21212bob","ja"};
		for(String s:names) {
			System.out.println(s+" "+checkByPatern(s));
		}
	}
	public static boolean checkByPatern(String s) {
		Pattern p=Pattern.compile("^[a-z0-9_-]{3,15}$");
		Matcher m=p.matcher(s.toLowerCase());
		return m.matches();
	}
	

}

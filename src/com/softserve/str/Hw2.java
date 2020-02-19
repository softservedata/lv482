package com.softserve.str;

public class Hw2 {
	public static void main(String[] args) {
		String origin = "      I    am      learning     Java   Core    \t   ";
		// String update = origin.replace(" ", " ").trim();
		String update = origin;
		do {
			update = update.replace("  ", " ");
		} while (update.indexOf("  ") > -1);
		update = update.trim();
		update = update.replace("I am", "I'm");
		System.out.println("origin:_" + origin + "_");
		System.out.println("update:_" + update + "_");
	}
}

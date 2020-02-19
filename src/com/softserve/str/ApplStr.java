package com.softserve.str;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApplStr {

	public static void main(String[] args) {
		/*-
		String str = "abracadabra";
		//String rStr = str.replace('a', 'o');
		//String rStr = str.replace("ra", "00");
		String rStr = str.replaceAll("ra", "00");
		System.out.println("str = " + str);
		System.out.println("rStr = " + rStr);
		*/
		//
		/*-
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Java");
		//
		// Invalid Solution
		System.out.println("(s1 == s2): " + (s1 == s2)); 	// true	
		System.out.println("(s1 == s3): " + (s1 == s3));	// false
		//
		// Correct Solution
		System.out.println("s1.equals(s2): " + s1.equals(s2)); 	// true
		System.out.println("s1.equals(s3): " + s1.equals(s3)); 	// true
		//
		System.out.println("s1.compareTo(s2): " + s1.compareTo(s2)); 	// 0
		System.out.println("s1.compareTo(s3): " + s1.compareTo(s3)); 	// 0
		//
		System.out.println("s1.hashCode(): " + s1.hashCode());
		System.out.println("s2.hashCode(): " + s2.hashCode());
		System.out.println("s3.hashCode(): " + s3.hashCode());
		//
		System.out.println("(s1.hashCode() == s2.hashCode()): " + (s1.hashCode() == s2.hashCode()) ); // true
		System.out.println("(s1.hashCode() == s3.hashCode()): " + (s1.hashCode() == s3.hashCode()) ); // true
		*/
		//
		/*-
		int i = 11;
		double PI = 3.1415926;
		String s1 = "abcd";
		String format = "integer %d  double %.2f  string %s";
		String s = String.format(format, i, PI, s1);
		System.out.println(s);
		System.out.printf(format, i, PI, s1);
		*/
		//
		/*-
		String s1 = new String("Hello ");
		String s2 = "And Goodbye";
		s1.concat(s2);
		System.out.println("from String s1: " + s1);
		StringBuilder sb = new StringBuilder(s1);
		sb.append(s2);
		// String str = sb.toString();
		System.out.println("from StringBuilder, sb: " + sb);
		// System.out.println("sb.reverse(): " + sb.reverse());
		System.out.println("sb.capacity(): " + sb.capacity());
		sb.append(" 0123456789_0123456789_abcd");
		System.out.println("new sb: " + sb);
		System.out.println("sb.capacity(): " + sb.capacity());
		sb.ensureCapacity(1000);
		System.out.println("sb.capacity(): " + sb.capacity());
		*/
		//
		// String pattern = "[a-z]+";
		// String pattern = " \\w*\\Bbb\\B\\w* ";
		// String pattern = " [^ ]*\\bbb\\b[^ ]* ";
		// String pattern = "abc|abcd|xabc";
		// String pattern = "abc";
		// String pattern = "<.*>";
		// String pattern = "<[^>]*>";
		// String pattern = "<[^>]+>";
		//String pattern = ">[^<]+<";
		//String pattern = "(\\w)\\1";
		//String pattern = "<([^>]+)>[^<]+</\\1>";
		//String pattern = "\\w+(\\.\\w+)*@(\\w+\\.)+\\w{2,}";
		String pattern = "(\\d{1,3}[,'])*\\d{1,3}\\.\\d{2}";
		//
		// String text = "Now is the time";
		// String text = "abc";
		// String text = "abcd000xabc111abc";
		//String text = " abba bba abb bb 00bb00 ";
		// String text = " abba bba abb ,bb! bb 00bb00 ";
		//String text = "<div><b>Beginning with bold text</b> next, text body, <i>italic text</i> end of text.</div>";
		//String text = "<div><b>Beginning with bold text</b> next, <span>text body,</span> <i>italic text</i> end of text.</div>";
		//String text = "abc.a_mm.b@gmail.com   h@i.ua";
		//String text = "abc.a_mm.b@gmail.com";
		String text = " 6 item(s) - $1'001,695.60 text";
		//
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		//
		if (m.matches()) {
			System.out.println("m.matches() is true");
		}
		m.reset();
		while (m.find()) {
			//System.out.print(text.substring(m.start(), m.end()) + "*");
			//System.out.println(text.substring(m.start() + 1, m.end() - 1).trim());
			System.out.println(text.substring(m.start(), m.end()));
			String first = text.substring(m.start(), m.end());
			double d = Double.parseDouble(first.replaceAll(",|'", ""));
			System.out.println("d = " + d);
		}
		//
		// System.out.println();
		// System.out.println("original text: " + text);
		// String text2 = text.replaceAll(pattern, "_");
		// System.out.println("modified text2: " + text2);
	}
}

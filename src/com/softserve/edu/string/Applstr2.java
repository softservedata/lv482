package com.softserve.edu.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Applstr2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List< String > list = new ArrayList();
        String pattern = "[A-Z]";
        String pattern2 = " ([A-Za-z])* ";
        String pattern3 = "([A-Za-z])+";
        String pattern4 = " ([A-Za-z])+$";
        String pattern5 = " ([A-Z])*";
        System.out.println("Entered First name, Last name and Patronymic :");
//        String string = scanner.nextLine();
        String string = "Sliusar Roman Igorovich";
        System.out.println("Original string: " + string);
        Pattern p = Pattern.compile(pattern);
        Pattern p2 = Pattern.compile(pattern2);
        Pattern p3 = Pattern.compile(pattern3);
        Pattern p4 = Pattern.compile(pattern4);
        Pattern p5 = Pattern.compile(pattern5);
        Matcher matcher = p.matcher(string);
        Matcher matcher2 = p2.matcher(string);
        Matcher matcher3 = p3.matcher(string);
        Matcher matcher4 = p4.matcher(string);
        Matcher matcher5 = p5.matcher(string);
        System.out.print("Initials: ");
        while (matcher.find()) {
            System.out.print(string.substring(matcher.start(), matcher.end()) + ".");
        }
        System.out.println();
        if (matcher3.find()) {
            System.out.println("First name: " + string.substring(matcher3.start(), matcher3.end()));
        }
        while (matcher2.find()) {
            System.out.println("Last name: " + string.substring(matcher2.start(), matcher2.end()));
        }

        while (matcher4.find()) {
            System.out.println("Patronymic: " + string.substring(matcher4.start(), matcher4.end()));
        }

        System.out.print("First Name and initials: ");

        while (matcher5.find()) {
            list.add(string.substring(matcher5.start(), matcher5.end()));
        }
        String str = new String(string.substring(matcher3.start(), matcher3.end()) + list);
        String str2 = new String(str.replaceAll("]", ""));
        String str3 = new String(str2.replaceAll("\\[", ""));
        String str4 = new String(str3.replaceAll(",",""));
        System.out.println(str4);

    }
}

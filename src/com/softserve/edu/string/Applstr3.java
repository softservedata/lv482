package com.softserve.edu.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Applstr3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entered five names: ");
//        String string = scanner.nextLine();
        String string ="Ivan Roman Petro Misha Kolya";
        List< String > list = new ArrayList();
        Pattern p = Pattern.compile("\\w*");
        Matcher m = p.matcher(string);
        while (m.find()) {
            System.out.println("name: " + string.substring(m.start(), m.end()) + " is correct");

        }
    }
}

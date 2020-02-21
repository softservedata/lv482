/*
package com.softserve.edu.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Applstr {
    public static void main(String[] args) {
        String string1 = "IT Academy";
        String string2 = "IT";
        String pattern = "[A-Z]";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(string1);
        Matcher m2 = p.matcher(string2);
        while (m.find()) {
            System.out.println("string 1 " + string1.substring(m.start(), m.end()));
        }
        while (m2.find()) {
            System.out.println("string 2 " + string2.substring(m2.start(), m2.end()));
        }

    }
}
*/

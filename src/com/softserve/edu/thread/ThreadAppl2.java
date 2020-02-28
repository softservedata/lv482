package com.softserve.edu.thread;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Create file1.txt file with a text about your career.
        Read context from file into array of strings. Each array item contains one line from file.
        Write in to the file2.txt
        1) number of lines in file1.txt.
        2) the longest line in file1.txt.
        3) your name and birthday date.*/
public class ThreadAppl2 {
    public static void main(String[] args) {
        String fileText = "file.txt";
        List< String > list = new ArrayList<>();
        String name = "";
        String birth = "";
        String s;
        try (BufferedReader br = new BufferedReader(new FileReader(fileText));) {
            while ((s = br.readLine()) != null) {
                list.add(s);
            }
        } catch (Exception e) {
            System.out.println("Error ");
        }
        System.out.println("my text file: " + list);
        System.out.println("number of lines: " + list.size());
        String max = list.get(0);
        int i=1;
        for (String current : list) {
            if(max.length() < current.length()) {
                max = current;
                i++;
            }
        }
        System.out.println("the longest line: " + max +" ,on position: "+i);
        for (String current : list) {
            if(current.contains("Roman")) {
                name = current;

            }
        }

//        System.out.println("original: "+ name);

        Pattern p = Pattern.compile("[A-Z]([A-Za-z])+");
        Matcher m = p.matcher(name);
        while (m.find()) {
            System.out.println("name: " + name.substring(m.start(), m.end()));
        }
        for (String current : list) {
            if(current.contains("02.12.1996")){
                birth=current;

            }
        }
        Pattern p2 = Pattern.compile("[0-9\\.]+");
        Matcher m2 = p2.matcher(birth);
        while (m2.find()) {
            System.out.println("birth: " +birth.substring(m2.start(), m2.end()));}
    }
}

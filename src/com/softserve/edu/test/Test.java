package com.softserve.edu.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Entered number ");
        long a = scanner.nextLong();
        List <Integer> b = new ArrayList<>();
        synchronized (Test.class) {
            new Thread(() -> {
                for (int i = 0; i < a; i++)
                    System.out.println("cycle number a: " + (i + 1));
                int c = 0;
                c++;
                System.out.println("cycle number c--------: " + (c));
                b.add(c);
            }).start();
        }
        synchronized (Test.class) {

            new Thread(() -> {
                for (int i = 0; i < a; i++)
                    System.out.println("cycle number b: " + (i + 1));
            }).start();
        }
        System.out.println(b.size());*/
        List< Integer > list = Arrays.asList(4,3,1,5,7,4,3,7,4,8,0,76,54,32,7,65);

        System.out.println("original: " + list);
        List< Integer > stream = list.stream().filter(n -> n >10).collect(Collectors.toList());
        System.out.println("update: " + stream);
    }
}

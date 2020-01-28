package com.softserve.edu.lv482;

import java.util.Scanner;
public class HomeWork {
    public static void main(String[] args) {
        System.out.print("Введіть Радіус:");
        double radius;
        Scanner sc =new Scanner(System.in);
        radius = sc.nextDouble();
        double area;
        area = Math.PI *(radius * radius);
        System.out.println("Площа кола дорівнює: " + area);
       double circumference;
       circumference = Math.PI * 2 * radius;
        System.out.println("Периметр дорівнює: " +circumference );
    }
}

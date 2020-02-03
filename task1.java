package com.company;

public class Main {

    public static void main(String[] args) {
    double radius = 10;
        double radius1 = radius;
        double perimeter = 2 * Math.PI * radius1;
        System.out.println("Perimeter is " + perimeter);
        double area = Math.PI * radius * radius;
        System.out.println("Area is " + area);
    }
}

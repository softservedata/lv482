package com.softserve.edu.oop1;

import java.util.Scanner;

public class Appl2 {
    public static void main (String[] ARGS){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name ," + "last name ," + "birth year ");
        Person p1 = new Person(scanner.nextLine(),scanner.nextLine(),scanner.nextInt());

        System.out.print("You " + p1.getAge() + " Years " + p1.getFirstName() +" "+ p1.getLastName());

    }
}


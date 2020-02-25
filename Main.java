package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person p1 = new Person();
        p1.input(sc);
        System.out.println(p1.output(p1));

        Person p2 = new Person();
        p2.input(sc);

        Person p3 = new Person();
        p3.input(sc);

        Person p4 = new Person();
        p4.input(sc);

        Person p5 = new Person();
        p5.input(sc);
    }
}

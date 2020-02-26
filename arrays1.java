package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int[] mounthDys = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;
    System.out.println("Enter number of mounth");
    int a = sc.nextInt();
    System.out.println("Days in this mounth is " + mounthDys[a-1]);
    sc.close();
    }
}
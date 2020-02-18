package com.softserve.edu.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PersonMap {
    public static void main(String[] args) {
        Map<Integer,String> personMap = new HashMap<>();
        personMap.put(1,"ivan");
        personMap.put(2,"petro");
        personMap.put(3,"orest");
        personMap.put(4,"vasya");
        System.out.println(personMap.values());
        System.out.print("Entered a number from 1 to 4 ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(personMap.get(a));




    }


}

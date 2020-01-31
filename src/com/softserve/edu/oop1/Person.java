package com.softserve.edu.oop1;

public class Person {
    private String firstName;
    private String lastName;
    private static int birthYear;
    private static int getAge;

    static {
        System.out.println();
        getAge = 0;
    }
    public Person(){
        firstName = "";
        lastName = "";
        birthYear = 0;
    }
    public Person(String firstName,String lastName,int birthYear){
        this.firstName = "firstName";
        this.lastName = "lastName";
    }
    public static int getAge(){
        return (2020 - birthYear);}

}

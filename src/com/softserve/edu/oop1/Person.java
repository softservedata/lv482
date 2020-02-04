package com.softserve.edu.oop1;

public class Person {
    private static String firstName;
    private static String lastName;
    private static int birthYear;
    private static int getAge;

    static {
        System.out.println("Person");
        getAge = 0;
    }
    public Person(){
        firstName = "";
        lastName = "";
        birthYear = 0;
        getAge = 2020 - birthYear;
    }
    public Person(String firstName,String lastName,int birthYear){
        this.firstName = "firstName";
        this.lastName = "lastName";
        this.birthYear = 0;
    }
    public static int getBirthYear(){ return birthYear;}
        public static String getFirstName(){return firstName;}
        public static String getLastName(){return lastName;}
        public static int getGetAge(){return 2020 - birthYear;}

        @Override
    public String toString(){return firstName;}


}

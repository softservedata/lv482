package com.company;

import java.util.Scanner;

public class Person {
    Scanner sc = new Scanner(System.in);

    private String firstName;
    private int birthYear;
    private String lastName;

    void DefCons(String firstName, String lastName) {
    firstName = this.firstName;
    lastName = this.lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
        int yearB = sc.nextInt();
        int c = 2020 - yearB;
    }
    public void input (Scanner sc) {
        System.out.println("Please enter your age ");
        this.birthYear = sc.nextInt();
        System.out.println("Please enter your first name ");
        this.firstName = sc.next();
        System.out.println("Please enter your last name ");
        this.lastName = sc.next();
    }

    public String output(Person person){
       return ("Name is " + person.getFirstName() + "Age is " + person.getBirthYear() + "Last name is " + person.lastName);
    }

}

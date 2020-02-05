//package com.softserve.edu.oop1;
//
//import java.time.LocalDate;
//
//public class Person {
//    private String firstName;
//    private String lastName;
//    private int birthYear;
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setBirthYear(int birthYear) {
//        this.birthYear = birthYear;
//    }
//
//    public int getBirthYear() {
//        return birthYear;
//    }
//    public Person(String firstName,String lastName,int birthYear){
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.birthYear = birthYear;
//
//    }
//    public int getAge (){
//        int age = LocalDate.now().getYear()-birthYear;
//        return age;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", birthYear=" + birthYear +
//                '}';
//    }
//}

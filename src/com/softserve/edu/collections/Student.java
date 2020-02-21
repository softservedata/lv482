package com.softserve.edu.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Tuple< S, I > {
    public S first;
    public I second;

    @Override
    public String toString() {
        return "Tuple{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public Tuple(String name, Integer course) {
    }
}

public class Student {
    private String name;
    private Integer course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public void printStudents() {
        Tuple< String, Integer > tupleList = new Tuple< String, Integer >(name, course);
        //  List<String> students = new ArrayList<>(name);
        //  List<Integer> courses = new ArrayList<>(course);
        for (Tuple<String,Integer> slt : Arrays.asList(tupleList)) {
            System.out.println("name "+slt.first +" course "+ slt.second);
        }

        System.out.println("Original List :" + tupleList);

    }

    public static void main(String[] args) {
        Student student = new Student("ivan", 2);
        Student student2 = new Student("petro", 1);
        Student student3 = new Student("vasul", 2);
        Student student4 = new Student("misha", 3);
        Student student5 = new Student("olya", 1);
        student.printStudents();
Student[] students=  {new Student("ivan", 2),new Student("ivan", 2),
        new Student("ivan", 2),new Student("ivan", 2),new Student("ivan", 2)};

    }


}

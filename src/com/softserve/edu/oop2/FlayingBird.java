package com.softserve.edu.oop2;

public class FlayingBird extends Bird {
    @Override
    public String toString() {
        return "FlayingBird{" +
                "swallow='" + swallow + '\'' +
                ", eagle='" + eagle + '\'' +
                '}';
    }

    String swallow;
    String eagle;
    @Override
    void fly() {
         feathers = true;
         layEggs = true;

    }
}

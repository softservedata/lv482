package com.softserve.edu.oop2;

public class Penguin extends NonFlyingBird {
    int speed = 50;

    @Override
    public String toString() {
        return "Penguin{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public void fly() {
        super.fly();
    }
}

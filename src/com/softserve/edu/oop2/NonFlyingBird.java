package com.softserve.edu.oop2;

class NonFlyingBird extends Bird {

    String penguin;
    String chicken;

    @Override
    public String toString() {
        return "NonFlyingBird{" +
                "penguin='" + penguin + '\'' +
                ", chicken='" + chicken + '\'' +
                '}';
    }

    @Override
    public void fly() {
        super.fly();{
            feathers = true;
            layEggs = true;
            chicken = "kurka";
        };
    }
}
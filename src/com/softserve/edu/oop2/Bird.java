package com.softserve.edu.oop2;

abstract class Bird {
    boolean feathers;
    boolean layEggs;

    @Override
    public String toString() {
        return "Bird{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }

   void fly(){
        feathers = false;
        layEggs = false;
    }


}

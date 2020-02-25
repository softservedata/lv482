package com.softserve.edu.exeption;

enum Color {
    RED, BLUE, WHITE}

enum Type {
    STUNTED, TALL}

public class Plant {
    int size;
    Color color;
    Type type;
    String name;


    public Plant(int size, Color color, Type type, String name) {
        this.size = size;
        this.color = color;
        this.type = type;
        this.name = name;

    }

    @Override
    public String toString() {
        return " Plant: " +
                " name: " + name +
                " size: " + size +
                " CM " +
                " color: " + color +
                " type: " + type + "";
    }
}

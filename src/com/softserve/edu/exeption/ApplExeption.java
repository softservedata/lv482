package com.softserve.edu.exeption;

import java.util.Scanner;

public class ApplExeption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entered colors: RED, WHITE or BLUE: ");
        String colors = scanner.nextLine();
        System.out.println("Entered type: STUNTED or TALL: ");
        String type = scanner.nextLine();
        Plant[] flowers = new Plant[]{
                new Plant(12, Color.RED, Type.STUNTED, "lilies"),
                new Plant(6, Color.BLUE, Type.TALL, "mallow"),
                new Plant(15, Color.RED, Type.TALL, "roses"),
                new Plant(8, Color.WHITE, Type.STUNTED, "violets"),
                new Plant(10, Color.BLUE, Type.STUNTED, "cornflowers")
        };
        // for (i=0;i<flowers.length;i++){
        System.out.println("Selected color: ");
        try {
            for (Plant plant : flowers) {
                if(plant.color == Color.valueOf(colors)) {
                    System.out.println(plant);
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Color entered incorrectly ");

        }
        System.out.println("Selected type: ");
        try {
            for (Plant plant2 : flowers) {
                if(plant2.type == Type.valueOf(type))
                {
                    System.out.println(plant2);
                }
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Type entered incorrectly ");

        }finally {
            System.out.println("Disigned by Roman");
        }
    }
}
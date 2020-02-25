package com.softserve.edu.exeption;

import java.util.Scanner;

public class ApplExeption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String colors = " ";
        String type = " ";

        Plant[] flowers = new Plant[]{
                new Plant(12, Color.RED, Type.STUNTED, "lilies"),
                new Plant(6, Color.BLUE, Type.TALL, "mallow"),
                new Plant(15, Color.RED, Type.TALL, "roses"),
                new Plant(8, Color.WHITE, Type.STUNTED, "violets"),
                new Plant(10, Color.BLUE, Type.STUNTED, "cornflowers")
        };
        try {
            System.out.println("What color or parameter to look for? if color entered 1, if type entered 2!");
            int i = Integer.parseInt(scanner.nextLine());
            if(i == 1) {
                System.out.println("Entered colors: RED, WHITE or BLUE: ");
                colors = scanner.nextLine();

                System.out.println("Selected color: " + colors);
                try {
                    for (Plant plant : flowers) {
                        if(plant.color == Color.valueOf(colors)) {
                            System.out.println(plant);
                        }
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Color entered incorrectly ");

                } finally {
                    System.out.println("Disigned by Roman");
                }
            } else if(i == 2) {
                System.out.println("Entered type: STUNTED or TALL: ");
                type = scanner.nextLine();
                System.out.println("Selected type: " + type);
                try {
                    for (Plant plant2 : flowers) {
                        if(plant2.type == Type.valueOf(type)) {
                            System.out.println(plant2);
                        }
                    }

                } catch (IllegalArgumentException e3) {
                    System.out.println("Type entered incorrectly ");
                } catch (Exception e2) {
                    System.out.println("Mishap");
                } finally {
                    System.out.println("Disigned by Roman");
                }
            } else {
                System.out.println("Iincorrectly type ");
            }

        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception ");


        } catch (Exception e2) {
            System.out.println(" Format Exception ");


        }


    }
}
package com.company;

public class Main {

    public static void main(String[] args) {
    int[] array = {-1, 2, -412, 124, 124, 142, 521, 52 ,42, 51};
        int sum = 0;
        for (int i = 0; i < array.length; i++) { sum += array[i];}
        System.out.println("Sum = " + sum);

        int product = 1;
        for (int i = 0; i < 5; i++) {
            if (array[i] > 0) {product = product * array[i];}}
        System.out.println("Product = " + product);


    }
}

package com.softserve.edu.arrays;


public class HomeWorkArrays3 {
    public static void main(String[] args) {
        int[] array = {-8, -14, 13, -51, 6, -50};
        int min = array[0];
        int imin = 0;
        int i = 0;
        int i2 = 0;
        int nextposition = 0;
        int positionSecondnumber = 0;
        int position = 0;
        int counter = 0;
        int secondPositive = 0;
        int positionOfSecondPositive = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                position = i;
            }
            if (array[i] > 0 && counter < 2) {
                secondPositive = array[i];
                positionOfSecondPositive = i;
                counter++;
            }
        }
        System.out.println("min = " + min);
        System.out.println("pos = " + position);
        System.out.println("second positive numbers: " + secondPositive);
        System.out.println("position of second positive :" + positionOfSecondPositive);
//        while (i < array.length) {
//            if (array[i] > 0) {
//                nextposition = i;
//                if (array[i] > 0) {
//                    positionSecondnumber = i;
//                    break;
//                }
//
//            }
//            i++;
//        }
//        for (i = 0; i < array.length; i++) {
//            if (array[i] > 0) {
//                nextposition = i;
//                if (array[i] > 0) {
//                    positionSecondnumber = i;
//                    break;
//                }
//            }
//        }
        System.out.println("position Second positive number: " + (positionSecondnumber + 1));
        while (i2 < array.length) {
            if (array[i2] < min) {
                min = array[i2];
                imin = i2;
            }
            i2++;
        }
        System.out.println("minimum " + min);
        System.out.println("position " + (imin + 1));

    }

}

package com.softserve.edu.arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] array ={2,3,6,631,8,34,76,23,-43,154};
        for(int i = 0;i< array.length;i++){
            System.out.print(array[i] + "  ");
        }
        int max = array[0];
        int imax = 0;
        int i = 0;
        while (i < array.length){
            if (array[i] > max){
                max = array[i];
                imax = i;
            }
            i++;
        }
        System.out.println("max: " + max);


    }
}

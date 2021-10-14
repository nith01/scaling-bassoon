package com.training.augprogram;

import java.lang.reflect.Array;
import java.util.Arrays;

public class largestNsmallestNum {
    public static void main(String[] args) {
        int[] number = {10, 20, -8, 2345, 6, 0, -887};
       /* int smallest = number[0];
        int largest = number[0];
        for (int i = 1; i < number.length; i++) {
            if (number[i] > largest) {//-887>2345
                largest = number[i];//2345
            } else if (number[i] < smallest) {//-887<-8
                smallest = number[i];//-887
            }

        }
        System.out.println("largest"+largest);
        System.out.println("smallest"+smallest);*/

        System.out.println(Arrays.toString(number));
        Arrays.sort(number);
       int smallest = number[0];
        System.out.println("Smallest number in the array is " +smallest);
       int largest = number[number.length-1];
        System.out.println("Largest number in the array is " +largest);


    }

}


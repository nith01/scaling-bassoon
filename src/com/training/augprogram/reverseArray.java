package com.training.augprogram;

import java.lang.reflect.Array;
import java.util.Arrays;

public class reverseArray {
    public static void main(String[]args){
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println("Original array");
        /*for (int arr1: arr){
            System.out.println(arr1);
        }*/
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Reverse order");
        for (int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}

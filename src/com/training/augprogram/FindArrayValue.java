package com.training.augprogram;

public class FindArrayValue {
    public static boolean contains(int[]arr,int item) {
        for (int num : arr) {
            if (item == num) {
                System.out.println("Check for number "+ item+" in array ");
                return true;
            }
        }
        return false;
    }
    public static void main(String[]args){
        int[] numbers = {1,2,3,4,5};
        System.out.println(contains(numbers,3));



    }
}

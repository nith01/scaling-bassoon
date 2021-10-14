package com.training.augprogram;

import java.util.Arrays;

public class MissingNumberInArray {
    public static int printMissingNumber(int[] numbers, int count){
        int expectedSum = count * ((count+1)/2);
        int actualSum = 0;
        for(int num : numbers){
            actualSum = actualSum+num;
        }
      return expectedSum - actualSum;
    }
    public static void main(String[]args){
       /* printMissingNumber(new int[]{1,2,3,4,6,7,8},8);
        printMissingNumber(new int[]{1,3,4,5},5);
        printMissingNumber(new int[]{1,2,3,4,5,6,7,9,10},10);*/
        int[] iArray = new int[]{1, 2, 3, 5};
        int missing = printMissingNumber(iArray, 5);
        System.out.printf("Missing number in array %s is %d %n",

                Arrays.toString(iArray), missing);
            }
}

package com.training.augprogram;

import java.util.Arrays;

public class test1 {
    public static int printMissingNum(int[] num,int count ){
        int expectedSum = count* ((count+1)/2);
        int actualSum = 0;
        for(int i=0;i<=num.length;i++){
            actualSum = actualSum+i;
        }
        return expectedSum - actualSum;

    }
    public static void main(String[]args){
        int[]a = {1,2,3,4,6,7,8,9,10};
        int missing = printMissingNum(a,10);
        System.out.printf("Missing number in array %s is %d %n ", Arrays.toString(a), missing);
    }
}

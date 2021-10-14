package com.training.augprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class secondLargestArray {
    public static void main(String[] args) {
        int[] listOfYears = {1983, 1964, 1985, 1976};
       System.out.println(Arrays.toString(listOfYears));
        Arrays.sort(listOfYears);
        int indexArray = listOfYears.length-1;
        System.out.println(indexArray);
        System.out.println("After sorting" + Arrays.toString(listOfYears));
        /*while(listOfYears[indexArray] == listOfYears[listOfYears.length-1]){
            indexArray--;
        }*/
        System.out.println("second largest array is " + listOfYears[indexArray]);

    }
}

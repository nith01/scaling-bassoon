package com.training.augprogram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class sortArrayList {
    public static void main(String[] args){
        List<Integer> listOfYears = new ArrayList<Integer>();
        listOfYears.add(1983);
        listOfYears.add(1964);
        listOfYears.add(1985);
        listOfYears.add(1976);
        System.out.println("Before sorting" + listOfYears);
        Collections.sort(listOfYears);
        System.out.println("After sorting" + listOfYears);
        Collections.sort(listOfYears, Collections.reverseOrder());
        System.out.println("After reversing order" + listOfYears);
        System.out.println(listOfYears.indexOf(1983));
        System.out.println(listOfYears.contains(1983));
        System.out.println(listOfYears.subList(1, 3));


    }
}

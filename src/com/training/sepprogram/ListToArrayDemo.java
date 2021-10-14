package com.training.sepprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArrayDemo {
    public static void main(String[]args){
        List<String> ls = new ArrayList<String>();
        ls.add("Apples");
        ls.add("Bananas");
        ls.add("papaya");
        System.out.println(ls);
        //Converting List to Array
        String[] arr = ls.toArray(ls.toArray(new String[ls.size()]));
        System.out.println("Converting List to Array" );
        System.out.println(Arrays.toString(arr));
    }
}

package com.training.sepprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListDemo {
    public static void main(String[]args){
        String[] arr = {"Apple","Mango","pineapple"};
        System.out.println(Arrays.toString(arr));
        List<String> l =new ArrayList<String>();
        for (String l1 : arr ) {
            l.add(l1);
        }
        System.out.println(l);
    }
}

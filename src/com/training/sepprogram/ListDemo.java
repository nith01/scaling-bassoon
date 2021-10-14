package com.training.sepprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void main(String args[]){
        //Creating a List
        //List<String> list=new ArrayList<String>();
        List<String> list=new ArrayList<String>();

        //Adding elements in the List
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        System.out.println("Returning element: "+list.get(2));
        list.set(1,"papaya");
        System.out.println(list);
        //Iterating the List element using for-each loop
        for(String fruit:list)
            System.out.println(fruit);
        System.out.println("--------------------------------");
        //sorting the list
        Collections.sort(list);
        for (String fruit:list ) {
            System.out.println(fruit);
        }
    }
}

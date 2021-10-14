package com.training.sepprogram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class IteratorDemo {
    //Program to remove odd elements from an ArrayList
    public static void main(String[]args){
       ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0;i<=10;i++){
            al.add(i);
        }
        System.out.println(al);
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            Integer I = (Integer) itr.next();
            if( I % 2 ==0){
                System.out.println(I);
            }
            else
                itr.remove();
        }
        System.out.println();

    }
}



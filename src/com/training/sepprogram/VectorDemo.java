package com.training.sepprogram;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[]args){
        Vector v = new Vector();
        System.out.println(v.capacity());
        for(int i = 1;i<=10;i++){
            v.addElement(i);//[1,2,3,4,5,6,7,8,9,10]
        }
       // System.out.println(v.capacity());
        v.addElement("A");
        System.out.println(v.capacity());
        System.out.println(v);
    }
}

package com.training.sepprogram;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[]args){
        HashSet<String> hs = new HashSet<String>();
        hs.add("Volvo");
        hs.add("BMW");
        hs.add("Mazda");
        System.out.println(hs);
        Iterator<String>I = hs.iterator();
        while(I.hasNext()){
            System.out.println(I.next());
        }
        //Remove element
        hs.remove("Volvo");
        System.out.println(hs);
        //to check if the element is present
        System.out.println(hs.contains("BMW"));
        System.out.println(hs.removeAll(hs));
        //to check if the HashSet is empty
        System.out.println(hs.isEmpty());

        System.out.println(hs);

    }
}

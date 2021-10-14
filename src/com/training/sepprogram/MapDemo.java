package com.training.sepprogram;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[]args ){
        Map<Integer,String> m = new HashMap<Integer,String>();
        m.put(101,"tom");
        m.put(102,"chris");
        m.put(103,"tony");
        m.put(104,"Jorn");
        System.out.println(m);
        for (Map.Entry m1:m.entrySet()) {
            System.out.println(m1.getKey()+" "+m1.getValue());
        }


    }
}

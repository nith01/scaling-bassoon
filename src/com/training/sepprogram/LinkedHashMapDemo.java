package com.training.sepprogram;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[]args){
        LinkedHashMap<String,Integer> lhMap = new LinkedHashMap<String,Integer>();
        lhMap.put("Canvas",5);
        lhMap.put("paint",33);
        lhMap.put("brush",20);
        lhMap.put("BlackCanvas",5);
        for (String I: lhMap.keySet()) {
            System.out.println("Key:"+ I + "   Value:"+lhMap.get(I));
            // Update the value of key
            lhMap.put("paint",30);
        }
    }
}

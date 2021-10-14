package com.training.sepprogram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        //add items
        hmap.put(100, "Violin");
        hmap.put(105, "Guitar");
        hmap.put(102, "Trumpet");
        System.out.println(hmap);

        //Access an item
        System.out.println(hmap.get(100));

        //remove an item
        /*hmap.remove(102);
        System.out.println(hmap);

        //to iterate hashMap
        for (Integer I : hmap.keySet()) {
            System.out.println(I + " " + hmap.get(I));
        }*/
        for (Integer I: hmap.keySet()) {

        }
        TreeMap<Integer,String> sortHM = new TreeMap<Integer, String>();
        sortHM.putAll(hmap);
        System.out.println(hmap);


        }
    }


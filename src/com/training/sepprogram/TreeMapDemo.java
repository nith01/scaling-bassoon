package com.training.sepprogram;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String args[]) {
        TreeMap<Integer,String> map=new TreeMap<Integer,String>();
      map.put(100,"Amit");
      map.put(102,"Ravi");
      map.put(101,"Vijay");
      map.put(103,"Rahul");
      System.out.println("Before invoking remove() method");
        for (Integer I:map.keySet()) {
            System.out.println(I + ":" + map.get(I));
        }
      map.remove(102);
      System.out.println("After invoking remove() method");
        for (Integer I:map.keySet()) {
            System.out.println(I + ":" + map.get(I));
        }


}
}


package com.training.augprogram;

import java.util.*;

public class ArrayListDuplicate {
    public static void main(String[]args){
        List<String> al = new ArrayList<String>();
        al.add("one");
        al.add("two");
        al.add("three");
        al.add("two");
        System.out.println("ArrayList with duplicates ");
        System.out.println(al);
        Set<String> ss = new LinkedHashSet<String>(al);
        System.out.println("ArrayList without duplicates");
        System.out.println(ss);
    }
}

package com.training.augprogram;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSubList {
    public static void main(String[]args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("one");
        al.add("two");
        al.add("three");
        al.add("two");
        System.out.println(al);
        ArrayList<String> al1 = new ArrayList<String>(al.subList(1, 2));
        System.out.println(al1);
    }
}

package com.training.sepprogram;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("pen");
        l.add("mat");
        l.add("door");
        l.add("table");
        System.out.println(l);
        ListIterator ltr = l.listIterator();
        while (ltr.hasNext()) {
            String s = (String) ltr.next();
            if (s.equals("mat")) {
                ltr.remove();
            } else if (s.equals("table")) {
                ltr.add("chair");
            } else if (s.equals("door")) {
                ltr.set("window");
            }

        }
        System.out.println(l);
    }


}

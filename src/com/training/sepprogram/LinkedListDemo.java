package com.training.sepprogram;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(500);
        ll.add(200);
        ll.add(300);
        ll.add(780);
        ll.add(56);
        System.out.println(ll);
        Iterator<Integer> i = ll.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        //To remove an element
        ll.remove(1);
        //To sort
        Collections.sort(ll);
        System.out.println(ll);
        //descending order
        Collections.sort(ll,Collections.reverseOrder());
        System.out.println(ll);
        //Highest number in the list
        System.out.println(Collections.max(ll));
        //Lowest number in the list
        System.out.println(Collections.min(ll));

    }

//non generic style
    /*{
        LinkedList l = new LinkedList();
        l.add("nitha");
        l.add(30);
        l.add(null);
        l.add("nitha");
        l.set(0, "software");
        l.add(0, "Hardware");
        l.removeLast();
        l.addFirst("abc");
        System.out.println(l);
    }*/
}

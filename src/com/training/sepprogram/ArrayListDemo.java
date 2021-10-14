package com.training.sepprogram;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Apple");
        al.add("Mango");
        al.add("grapes");
        al.add("Banana");
        al.add("papaya");
        System.out.println(al);
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        /*for(String s: al){
            System.out.println(s);
        }*/

        //to remove an element
           /* al.remove(1);
            System.out.println(al);//using index
             al.remove("Apple");
            System.out.println(al);//object removal
*/


    }
}










    /*{
        ArrayList al = new ArrayList();
        //adding elements in ArrayList
        al.add("A");
        al.add(10);
        al.add("A");
        al.add(null);
        System.out.println(al);//[A, 10, A, null]
        //removing element at perticular index
        al.remove(2);
        System.out.println(al);//[A,10, null]
        al.add(2,"M");
        al.add("N");
        System.out.println(al);//[A, 10, M, N]
    }*/


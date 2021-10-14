package com.training.augprogram;


import java.util.ArrayList;

public class arrayListTest {
    public static void main(String[]args){
        /*List<String> test = new ArrayList<String>();
        String[] items = {"abc","def","ghi"};
        for (String item:items) {
            test.add(item);
        }
        int size = test.size();
        System.out.println(size);
        int length = items.length;
        System.out.println(length);*/
       /*List<Integer> il = new ArrayList<Integer>();
       il.add(1990);
       il.add(1900);
       il.add(2009);
        System.out.println("Before synchronizing");
        System.out.println(il);
       il = Collections.synchronizedList(il);
       synchronized (il){
           Iterator<Integer> ii = il.iterator();
           System.out.println("After synchronizing");
           while(ii.hasNext()){

               System.out.println(ii.next());*/
        ArrayList<String> language = new ArrayList<String>();
        language.add("Java");
        language.add("C++");
        language.add("Scala");
        StringBuilder sb = new StringBuilder();
        for(String array : language){
            sb.append(array).append(";");

        }
        String strFromArrlist =sb.toString();
        System.out.println(strFromArrlist);




    }
}




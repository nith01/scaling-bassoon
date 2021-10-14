package com.training.augprogram;

import java.util.ArrayList;

public class ArrayListToString {
    public static void main(String[]args){
        ArrayList<String> language = new ArrayList<String>();
        language.add("Java");
        language.add("C++");
        language.add("Scala");
        StringBuilder sb = new StringBuilder();
        System.out.println(language);
        for(String array : language){
            sb.append(array).append(";");

        }
        String strFromArrlist =sb.toString();
        System.out.println(strFromArrlist);

    }
}

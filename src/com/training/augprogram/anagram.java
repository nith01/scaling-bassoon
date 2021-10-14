package com.training.augprogram;

import java.util.Arrays;

import static java.lang.System.*;

public class anagram {
    public static void main(String[]args){
        String a = "braggy";
        String b = "grab";
        a =a.toLowerCase();
        b =b.toLowerCase();
        if(a.length()!=b.length()){
            System.out.println("not a anagram");
        }
        else {
            char[] str1 = a.toCharArray();
            char[] str2 = b.toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str2);

            if(Arrays.equals(str1, str2) == true) {
                System.out.println("Both the strings are anagram");
            }
            else {
                System.out.println("both Strings are not anagram");
            }
        }

    }

}

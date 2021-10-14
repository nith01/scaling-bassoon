package com.training.augprogram;

public class reverseString {
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();

    }


    public static void main(String[]args){
        System.out.println(reverseString.reverse("nitha"));
    }
}

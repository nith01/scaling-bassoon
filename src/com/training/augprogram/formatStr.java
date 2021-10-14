package com.training.augprogram;

public class formatStr {
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();

    }





    public static void main(String[] args) {
        System.out.println("reverse string is :"+formatStr.reverseString("Nitha"));
        System.out.println("reverse string is :"+formatStr.reverseString("Sonith Ajamal"));

        }
      }



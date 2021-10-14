package com.training.augprogram;
/*
Write a method that uses a while loop. This method would replace
every vowel in the String with X. Call your method from the main method.
e.g., the String
Java is Fun
should become
JXvX Xs FXn
*/
public class ReplaceChar {


    public static String vowelProcess(String str){
     String ReplacedStr = "";
     int length = str.length();
     int i = 0;
     while(i<length){
         if (str.charAt(i)== ('a') || str.charAt(i)== ('e')|| str.charAt(i)== ('i')
                 ||str.charAt(i)== ('o') ||str.charAt(i)== ('u') ){
             ReplacedStr += 'X';
         }
         else {
             ReplacedStr += str.charAt(i);
         }
         i++;
     }
      return ReplacedStr;
    }
 public static void main(String[]args){
        String s = "Java is fun";
        String newStr = vowelProcess(s);
        System.out.println(newStr);
 }
}

package com.training.augprogram;

public class PalindromeChecker {
    public static boolean isPalindrome(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev= sb.toString();
        if(str.equalsIgnoreCase(rev)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[]args){
        System.out.println(PalindromeChecker.isPalindrome("Malayalam"));
        System.out.println(PalindromeChecker.isPalindrome("Baloon"));
    }
}

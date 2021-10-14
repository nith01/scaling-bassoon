package com.training.augprogram;
//Program to count the total number of punctuation characters exists in a string.
//(! , . , ' , - , " , ? , ; )
public class punctuation {
    public static void main(String[] args) {
        int count = 0;
        String str = "Good Morning! Mr. James Potter. Had your breakfast?";
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '!' || str.charAt(i) == '.' || str.charAt(i) == '\'' || str.charAt(i) == '-'
                    || str.charAt(i) == '\"' || str.charAt(i) == '?' || str.charAt(i) == ';') count++;
        }
        System.out.println("Total punctuation mark in the sentance is " + count);
    }
}

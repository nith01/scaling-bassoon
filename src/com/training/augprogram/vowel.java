package com.training.augprogram;

import java.util.Arrays;

public class vowel {
    public static void main(String[]args){
        int countVowel = 0;
        int countChar = 0;
        String str = "This is a really simple sentence";
        str=str.toLowerCase();
        String word[] = str.split("" );
        System.out.println(Arrays.toString(word));
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'a'||str.charAt(i) == 'e'||str.charAt(i) == 'i'||str.charAt(i) == 'o'||str.charAt(i) == 'u'){
                System.out.println(str.charAt(i));
                countVowel++;
            }
            else if(str.charAt(i)>='a'&&str.charAt(i)<='z')
                countChar++;

        }
        System.out.println("Count of vowel in the sentence is "+countVowel);
        System.out.println("Count of characters in the sentence is "+countChar);

    }
}

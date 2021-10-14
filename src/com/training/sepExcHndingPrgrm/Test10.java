package com.training.sepExcHndingPrgrm;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;


    //Throws example:

public class Test10{
    public static void main(String[] args)throws InterruptedException {
        Thread.sleep(5000);
    }



   //Case1: Case 1:we can use throws keyword only for Throwable types
   /*public class Test10 extends RuntimeException{
    public static void main(String[] args)throws Test10 {

       }*/


  //Case2:We can use throws keyword only for constructors and methods but not for classes
    /*public class Test10{

               Test10()throws Exception{
               }
               public void method10()throws Exception{
               }
           }*/

 //Case3: checked exception should be handled either by try catch or by throws keyword
    /*public class Test10 {
         public static void main(String[]args){
             throw new Exception();  //checked Exception
         }*/


/*public class Test10 {
     public static void main(String[]args){
         throw new Error();  //unchecked Exception
     }
 }*/

//Case 4:if there is no chance of rising an exception then we can't right catch block for that exception
/*public class Test10 {

    public static void main(String[] args) {
        try {
            System.out.println("Hello");
        } catch (ArithmeticException e) {  //---------unchecked

        }
        try {
            System.out.println("Hello");
        } catch (Exception e) {  //---------partially checked

        }
        try {
            System.out.println("Hello");
        } catch (IOException e) {  //---------checked

        }
        try {
            System.out.println("Hello");
        } catch (InterruptedException e) {  //---------checked

        }
        try {
            System.out.println("Hello");
        } catch (Error e) {  //---------unchecked

        }*/

        //--------------- In this program if we are removing at least one throws keyword
        //then the program won't compile.


       /* public static void main(String[] args)throws InterruptedException{
            doStuff();
        }
        public static void doStuff()throws InterruptedException{
            doMoreStuff();
        }
        public static void doMoreStuff()throws InterruptedException{
            Thread.sleep(5000);*/

    }





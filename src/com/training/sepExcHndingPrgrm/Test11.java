package com.training.sepExcHndingPrgrm;

public class Test11  {
    //ArrayIndexOutOfBoundsException
   /* public static void main(String[]args){
        int[] x = new int[10];
        System.out.println(x[1]);
        System.out.println(x[100]);
        System.out.println(x[-100]);
    }*/

    //NullPointerException
   /* public static void main(String[]args){
      String s = null;
        System.out.println(s.length());
    }*/

    //StackOverFlowError
    /*public static void methodOne(){
        methodTwo();
    }
    public static void methodTwo(){
        methodOne();
    }
    public static void main(String[]args){
        methodOne();
    }*/

    //ClassCastException
    /*public static void main(String[]args){
        Object o = new Object();
        String s = (String) o;
    }*/

   // IllegalArgumentException
  /* public static void main(String[] args){
       Thread t=new Thread();
       t.setPriority(10);//valid
       t.setPriority(100);//invalid
   }*/
    //NumberFormatException
    public static void main(String[] args){
        int i=Integer.parseInt("10");
        System.out.println(i);
        try{
      int j=Integer.parseInt("ten");
        int k =Integer.parseInt("10A");
        System.out.println(j);
        System.out.println(k);}
        catch(NumberFormatException e){

        }


    }
}

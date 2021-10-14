package com.training.sepExcHndingPrgrm;

public class Test9  extends RuntimeException
{
    //throw case 2
    /*static ArithmeticException e=new ArithmeticException("/ by zero");
    public static void main(String[]args) {
        System.out.println(10 / 0); //.......................both line 8 and 10 will print the same output
        //throw new ArithmeticException("/ by zero");
        throw e;*/
        //System.out.println("Hello");  //........................ we can't take any statement after throw statement
    //}

    //throw case 3
    public static void main(String[] args) {
        throw new Test9();     //--------------Test9 is not throwable type

    }
}

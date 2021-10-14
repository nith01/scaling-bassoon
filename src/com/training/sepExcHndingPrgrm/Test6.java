package com.training.sepExcHndingPrgrm;

public class Test6 {
    public static void main(String[] args)
    {
        try
        {
            System.out.println("try");
            System.exit(0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("catch block executed");
        }
        finally
        {
            System.out.println("finally block executed");
        }
    }
}

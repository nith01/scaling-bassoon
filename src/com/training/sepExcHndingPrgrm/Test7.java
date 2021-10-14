package com.training.sepExcHndingPrgrm;

public class Test7 {
    public static void main(String[] args)
    {
        try{
            System.out.println("Outer try");
            try{
                System.out.println("Inner try");
                System.out.println(10/0);
               }
            catch (ArithmeticException e){
                System.out.println("Inner catch block");
            }
            System.out.println("After inner try-catch");
        }
        catch(Exception e)
        {
            System.out.println("Outer catch block");
        }
        finally {
            System.out.println("Outer finally");
        }

        /*try{
            System.out.println("Outer try");
            try{
                System.out.println("Inner try");
                System.out.println(10/0);
            }
            catch (NullPointerException e){
                System.out.println("Inner catch block");
            }
            System.out.println("After inner try-catch");
        }
        catch(Exception e)
        {
            System.out.println("Outer catch block");
        }
        finally {
            System.out.println("Outer finally");
        }*/
        }
}

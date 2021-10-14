package com.training.sepExcHndingPrgrm;

public class Test4 {
    public static void main(String[] args) {
        //Case-1: If there is no Exception
        try {
            System.out.println("try block executed");
        }
        catch(ArithmeticException e) {
            System.out.println("catch block executed");
        }
        finally {
            System.out.println("finally block executed");
        }
//Case-2: If an exception raised but the corresponding catch
//block matched
            /*try {
                System.out.println("try block executed");
                System.out.println(10/0);
            }
            catch(ArithmeticException e) {
                System.out.println("catch block executed");
            }
            finally {
                System.out.println("finally block executed");
            }*/
//Case-3: If an exception raised but the corresponding catch
//block not matched
       /* try
        {
            System.out.println("try block executed");
            System.out.println(10/0);
        }
        catch(NullPointerException e)
        {
            System.out.println("catch block executed");
        }
        finally
        {
            System.out.println("finally block executed");
        }*/


    }

}

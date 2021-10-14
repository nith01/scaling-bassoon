package com.training.sepExcHndingPrgrm;

public class Test5 {
    public static void main(String[] args) {
        try {
            System.out.println("try block executed");
            return;
        } catch (ArithmeticException e) {
            System.out.println("catch block executed");
        } finally {
            System.out.println("finally block executed");
        }


       /*     System.out.println(m1());
        }

    private static boolean m1() {
        return;
    }

    public static int intm1(){
            try {
                System.out.println(10 / 0);
                return 777;
            } catch (ArithmeticException e) {
                return 888;
            }
            finally {
                return 999;
            }
        }*/
    }
}

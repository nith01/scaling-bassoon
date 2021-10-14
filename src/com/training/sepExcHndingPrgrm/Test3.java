package com.training.sepExcHndingPrgrm;

public class Test3 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
            //e.getMessage();
            //e.toString();
        }
    }
}

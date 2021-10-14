package com.training.sepOOPs.Abstraction;

public class TestBank {
    public static void main(String[] args) {
        Bank b;
        b = new ICICI();
        System.out.println("Rate of interest of ICICI Bank : " + b.rateOfInterest() + "%");

        b = new SBI();
        System.out.println("Rate of interest of SBI Bank : " + b.rateOfInterest() + "%");
    }
}

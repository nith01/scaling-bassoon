package com.training.sepOOPs;

public class BMW extends Car{//Has A Relationship
    //when method is present in parent class as well as in child class with the same name and
    // same no:of argument is called method overriding
    public void start(){
        System.out.println("BMW...start");//overriden method
    }
    public void theftSafety(){
        System.out.println("BMW...theftSafety");
    }
}

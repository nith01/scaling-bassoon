package com.training.sepOOPs.Polymorphysm;

public class cat extends Animal{
    private String color;

    public String getColor(){
        return color;
    }

    public void eat(){
        System.out.println("nom nom nom");
    }
    public void setColor(String color){
        this.color = color;
    }
}

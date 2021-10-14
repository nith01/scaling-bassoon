package com.training.sepOOPs.Polymorphysm;

public class Dog extends Animal {
    private String breed;

    public String getBreed(){
        return breed;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public void eat(){
        System.out.println("chomp chomp");
    }

}

package com.training.sepOOPs;

public class ConstructorExample {
    int id;
    String name;
    ConstructorExample(int i, String n){
     id = i;
     name = n;
    }
     void display(){
        System.out.println(id+ " "+ name);
    }
    public static void main(String[]args){
        ConstructorExample x = new ConstructorExample(1,"abc");
        ConstructorExample y = new ConstructorExample(2,"xyz");
        x.display();
        y.display();


    }
}

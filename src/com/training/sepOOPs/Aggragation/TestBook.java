package com.training.sepOOPs.Aggragation;

public class TestBook {
    public static void main(String []args){
        Auther auther = new Auther("John ", "USA ", 42);
        Book b =new Book("Java for Beginners ", 35,auther);
        System.out.println("Book name " + b.name);
        System.out.println("Book price "+ b.price);
        System.out.println("Author details "+b.auther);

        System.out.println("Auther name"+ auther.autherName);
        System.out.println("Author age" + auther.age);
        System.out.println("Auther place" + auther.place);

    }

}

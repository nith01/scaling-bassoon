package com.training.sepOOPs.Polymorphysm;

public class TestAnimal {
    public static void main(String []args){
      Animal myAnimal = new Animal();
      myAnimal.eat();

      Dog myDog =new Dog();
      myDog.eat();
      myDog.setBreed("Husky");
        System.out.println(myDog.getBreed());

      cat myCat = new cat();
      myCat.eat();
        //Dynamic polymorphism
        //top casting
        //method over riding
       /* Animal a;
        a = new Dog();
        a = new cat();
        a.eat();
        a.getName();
        a.getColor();*/

    }
//single polymorphism

int sum(int a,int b){
    return a+b;
}
int sum(int a, int b, int c){
    return a+b+c;
}
int sum( int a, double b){
    return a+(int)b;
}
}
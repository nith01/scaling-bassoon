package com.training.sepOOPs;

public class TestCar {
    public static void main(String[] args) {
        // static polymorphism or compile time polymorphism
        BMW bmw = new BMW();
        bmw.start();//override
        bmw.stop();
        bmw.refuel();
        bmw.theftSafety();
        bmw.engine();
        System.out.println("***********");

        Car c = new Car();
        c.start();
        c.stop();
        c.refuel();
        System.out.println("***********");
        //Top Casting:
        // making BMW class refered by parent class referance variable
        //child class object can be refered by parent class reference variable
        // is called dynamic polymorphysm or runtime polymorphism
        Car c1= new BMW();
        c1.start();//overriden method will be called by using dynamic polymorphism
        c1.stop();
        c1.refuel();
        System.out.println("***********");

        //Down Casting
        BMW b1 = (BMW) new Car();//ClassCastException

        //GrantParent top casting
        Vehicle v1 = new BMW();
        v1.engine();




    }
}

package com.training.sepExcHndingPrgrm;

class Vehicle {
    //Run time stack example
   /* String type = "4w";
    int maxSpeed = 120;

    Vehicle(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }

    class Car extends Vehicle {
        String trans;

        Car(String trans) {
            //Line1---------------------first line shouldn't be empty(will take super() as default)
            this.trans = trans;   //CE
        }

        Car(String type, int maxSpeed, String trans) {
            //Line 2-------------------cannot take bot super and this at a time
            super(type, maxSpeed);
            this(trans);   //CE
        }

        class Test {

            public static void main(String[] args) {
                Car c1 = new Car("Audi");
                Car c2 = new Car("4w", 150, "manual");
                System.out.println(c1.type + ".." + c1.maxSpeed + c1.trans);
                System.out.println(c1.type + ".." + c1.maxSpeed + c1.trans);

            }
        }
    }*/
}
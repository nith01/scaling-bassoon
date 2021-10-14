package com.training.sepOOPs.Inheritance;

public class TestEmployees {
    public static void main(String[]args){
        Programmer p = new Programmer();
        p.Employee_Details();//over-riding
        p.Programmer_Details();
        System.out.println("Programmer salary " + p.P_salary);
        System.out.println("Programmer bonus " + p.bonus);
        System.out.println("**********");

        Manager m = new Manager();
        m.Employee_Details();
        m.Manager_Details();
        System.out.println("Manager salary " + m.M_salary);
        System.out.println("Manager bonus " + m.bonus);
        System.out.println("**********");

        Employee e = new Employee();
        System.out.println("prog sal" + e.P_salary);
        e.Employee_Details();

        //Dynamic Polymorphism/Runtime Polymorphism
        Employee e1 = new Manager();//Top casting
        e.Employee_Details();
    }
}

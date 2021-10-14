package com.training.sepOOPs.InterfaceConcept;

import com.training.sepOOPs.InterfaceConcept.WHO;

    public interface USA extends WHO {
        int min_fee = 10;
        public void physioServices();//method declaration
        public void oncologyServices();
        public void orthopedicServices();
        public void radiologyServices();

        //cannot create the object of Interface
        //only method declaration--method prototype--no method body
        //can not create static prototype method in interface
        //but interface variables are static and final by default
        //abstraction--100%

        //static method with method body:
        public static void Services_911(){

            System.out.println("USA...911 services...");
        }
        default void internship(){

            System.out.println("USA-Internship...");
        }
    }


package com.training.sepOOPs.InterfaceConcept;

public class TestHospital {
    public static void main(String[]args){
        KaiserHospital k = new KaiserHospital();
        k.oncologyServices();
        k.ambulanceServices();
        k.pediatricServices();
        k.emergencyServices();
        k.neuroServices();


        System.out.println(k.min_fee);
        System.out.println(USA.min_fee);
        USA.Services_911();
        India.dengueServices();
        k.internship();
        //top casting:
        USA usa = new KaiserHospital();//child class objects can be refered by parent interface
        usa.oncologyServices();
        usa.orthopedicServices();
        usa.physioServices();
        usa.internship();


    }
}

package com.training.sepOOPs.InterfaceConcept;

public class Excel implements MsOffice{
    @Override
    public void open() {
        System.out.println("for opening excel file");
    }

    @Override
    public void write() {
        System.out.println("for writing excel file");
    }

    @Override
    public void save() {
        System.out.println("for saving excel file");
    }
}

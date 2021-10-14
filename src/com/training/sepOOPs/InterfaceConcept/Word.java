package com.training.sepOOPs.InterfaceConcept;

public class Word implements MsOffice{
    @Override
    public void open() {
        System.out.println("for opening word file");
    }

    @Override
    public void write() {
        System.out.println("for writing word file");
    }

    @Override
    public void save() {
        System.out.println("for saving word file");
    }
}

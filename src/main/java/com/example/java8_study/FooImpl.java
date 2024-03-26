package com.example.java8_study;

public class FooImpl implements FooInterface{

    String name;

    @Override
    public void printName() {
        System.out.println("hi");
    }

    @Override
    public String getName() {
        return this.name;
    }
}

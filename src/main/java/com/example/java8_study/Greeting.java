package com.example.java8_study;

public class Greeting {
    private String name;

    public Greeting() {}

    public String getName() {
        return name;
    }

    public Greeting(String name) {
        this.name = name;
    }

    public String hello(String name) {
        return "hello" + name;
    }

    public static String hi(String name) {
        return "hi" + name;
    }
}

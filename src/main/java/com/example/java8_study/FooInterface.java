package com.example.java8_study;

public interface FooInterface {
    void printName();
    /**
     * @implSpec
     * 상세 구현 내용에 대한 설명
     * */
    default void printNameUpperCase() {
        System.out.println(getName().toUpperCase());
    }

    static void printAnyThing() {
        System.out.println("히히");
    }

    String getName();
}



 
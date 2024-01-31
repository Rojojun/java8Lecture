package com.example.java8_study;

// 함수형 인터페이스임 -> 추상메서드가 하나니깐
@FunctionalInterface
public interface RunSomething {

    void doIt();

    static void printName() {
        System.out.println("name");
    }

    default void printAge() {
        System.out.println("age");
    }
}

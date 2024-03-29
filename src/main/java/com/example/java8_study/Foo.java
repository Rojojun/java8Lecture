package com.example.java8_study;

public class Foo {
    public static void run() {
        // Annonimous inner class : before JDK8
        RunSomething runSomething = new RunSomething() {
            @Override
            public void doIt() {
                System.out.println("Before JDK 8 : Hi");
            }
        };

        // JDK8 way
        RunSomething runSomethingLambda = () -> System.out.println("JDK8 way : Hi");

        IntRunSomething intRunSomething = number -> number + 10;
        // 상태값이 있으면 pure function이 아니여서 람다가 안됨
    }
}

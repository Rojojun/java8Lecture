package com.example.java8_study;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {
    private Greeting greeting;

    @Test
    void 메소드_레퍼런스_테스트() {
        Greeting greetingIn = new Greeting();
        UnaryOperator<String > hello = greetingIn::hello;
        UnaryOperator<String> hi = Greeting::hi;
        Supplier<Greeting> newGreeting = Greeting::new;;

        System.out.println(hello.apply("Test_One"));
        System.out.println(hi.apply("Test_Two"));

        var g = newGreeting.get();
        System.out.println(g);
    }

    @Test
    void function_테스트() {
        Function<String, Greeting> greetingFunction = Greeting::new;
        Greeting greetingIn = greetingFunction.apply("test1");
        System.out.println(greetingIn.getName());

        Supplier<Greeting> newGreeting = Greeting::new;
    }

    @Test
    void 임의_객체_인스턴스_메소드() {
        String[] names = {"test1", "test2", "test3"};
        Arrays.sort(names, String::compareToIgnoreCase);
    }
}
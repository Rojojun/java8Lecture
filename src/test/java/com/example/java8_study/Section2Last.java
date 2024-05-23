package com.example.java8_study;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Section2Last {
    List<String> name = List.of("A", "B", "C", "D");

    @Test
    void iterateTest() {
        name.forEach(System.out::println);
    }

    @Test
    void splitoratorTest() {
        while (name.spliterator().tryAdvance(System.out::println));
        var a = name.spliterator().trySplit(); // 두개의 스플리터로 만듬
        while (a.tryAdvance(System.out::println));

        // 두 개로 나누는 것의 장점은 무엇인가?
        // 병렬로 처리를 할 수 있음
    }

    @Test
    void streamTest() {
        // 요소를 스트림으로 만들어서 함수화하여 사용 가능
        name.stream().map(String::toLowerCase)
                .filter(s -> s.startsWith("a"))
                .count();
    }

    @Test
    void removeIfTest() {
        name.removeIf(s -> s.startsWith("a"));
    }

    @Test
    void comparatorTest() {
        Comparator<String> comparator = String::compareToIgnoreCase;
        name.sort(String::compareToIgnoreCase);
        name.sort(comparator.reversed().thenComparing(s -> s.startsWith("a")));
    }
}

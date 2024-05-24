package com.example.java8_study;

import org.junit.jupiter.api.Test;

import java.util.List;

public class StreamTest {
    List<String> name = List.of("Harry", "Kane", "Son", "Messi");

    @Test
    void operteTest() {
        name.stream().map(String::toUpperCase);

        // lazy의 의미
        name.stream().map(s -> {
            System.out.println(s);
            return s.toUpperCase();
        });
        // 실행 안됨, 종료 오퍼레이터가 없음

        for (String name : name) {
            if (name.startsWith("K")) {
                System.out.println(name.toUpperCase());
            }
        }
        // 병렬 처리 어려움

        name.parallelStream().map(String::toUpperCase)
                .toList();
    }

    @Test
    void examples() {

    }
}

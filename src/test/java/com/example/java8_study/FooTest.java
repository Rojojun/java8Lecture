package com.example.java8_study;

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.UnaryOperator;

class FooTest {
    private Plus10 plus10;

    public FooTest() {
        this.plus10 = new Plus10();
    }

    @Test
    void foo테스트() {
        Foo.run();
    }

    @Test
    void Plus10테스트() {
        Function<Integer, Integer> plus10 = i -> i +10;
        Function<Integer, Integer> multiply2 = i -> i * 2;

        System.out.println(plus10.apply(10));

        Function<Integer, Integer>  multiply2AndPlus10 = plus10.compose(multiply2);
        System.out.println(multiply2AndPlus10.apply(2));
        // T * 2 + 10

        System.out.println(plus10.andThen(multiply2).apply(2));
        // (10 + T) * 2

        UnaryOperator<Integer> plus10Unary = i -> i + 10;
    }

    @Test
    void 변수캡쳐() {
        int baseNumber = 10;

        // 로컬 클래스
        class LocalClass {
            void  printBaseNumber() {
                System.out.println(baseNumber);
            }
        }

        // 익명클래스에서 로컬변수 참조
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(baseNumber);
            }
        };

        IntConsumer printInt = (i) -> System.out.println(i + baseNumber);

        printInt.accept(10);
    }
}
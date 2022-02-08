package com.chris.learning;

public interface Interface1 {
    void method1();

    void method2();

    default void method3() {
        System.out.print("method3");
    }
}

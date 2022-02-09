package com.chris.learning;

public class MyClass implements MyInterface {


    public static void main(String[] args) {
        MyInterface abc = new MyClass();
        abc.method1();
        System.out.println(MyInterface.c1);

    }
}


package com.chris.learning;

import static java.lang.System.*;

public class MyNumberRunner {
    public static void main(String[] args) {
        MyNumber number = new MyNumber(3);
            number.number = 10;
            number.staticNum = 10;
        System.out.println(number.isPrime());
        System.out.println(number.sumUptoN());
        number.printANumberTriangle();
    }
}

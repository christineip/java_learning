package com.chris.learning;

import java.io.PrintStream;
import java.util.Arrays;

public class AnimalRunner {
    public static void main(String[] args) {
        Cat2 cat = new Cat2();
        Dog2 dog = new Dog2();
        Animal2[] animal2s={new Cat2(), new Dog2()} ;
        for (Animal2 a:animal2s) {
            a.bark();
        }
    }
}

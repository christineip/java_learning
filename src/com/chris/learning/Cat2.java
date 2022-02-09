package com.chris.learning;

public class Cat2 extends Animal2 {
    void  bark() {
        System.out.println("Meow Meow");
    }

    @Override
    public String toString() {
        return "This is a Cat";
    }
}

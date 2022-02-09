package com.chris.learning;

public class Dog2 extends Animal2{
    void bark(){
        System.out.println("Bow Bow");
    }

    @Override
    public String toString() {
        return "This is a DOG";
    }
}

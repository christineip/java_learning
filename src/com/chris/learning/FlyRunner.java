package com.chris.learning;

public class FlyRunner {
    public static void main(String[] args) {
        Bird christine = new Bird();
        Aeroplane chris = new Aeroplane();
        Flyable[] christineip = {new Bird(), new Aeroplane()};
        for (Flyable f: christineip
        ) {
            f.fly();
        }
    }
}

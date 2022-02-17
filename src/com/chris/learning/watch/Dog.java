package com.chris.learning.watch;


public class Dog implements Watch {
    @Override
    public String seeAtNight() {
        return "I cannot see at night";
    }
}

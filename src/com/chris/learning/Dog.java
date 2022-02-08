package com.chris.learning;

public class Dog implements Watch{
    @Override
    public String seeAtNight() {
        return "I cannot see at night";
    }
}

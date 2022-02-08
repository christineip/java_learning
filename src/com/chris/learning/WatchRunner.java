package com.chris.learning;

public class WatchRunner {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Watch watchCat = new Cat();
        Watch watchDog = new Dog();


        System.out.println(cat.seeAtNight());
        System.out.println(dog.seeAtNight());
        System.out.println(watchCat.seeAtNight());
        System.out.println(watchDog.seeAtNight());
    }
}

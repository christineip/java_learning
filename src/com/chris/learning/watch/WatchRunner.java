package com.chris.learning.watch;

public class WatchRunner {

    public static  Watch method1(){
        return new Dog();
    }
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Watch watchCat = new Cat();
        Watch watchDog = method1();
        Cat dummyCat = cat;
        Cat dummyCat2 = (Cat)watchCat;


        System.out.println(cat.seeAtNight());
        System.out.println(dog.seeAtNight());
        System.out.println(watchCat.seeAtNight());
        System.out.println(watchDog.seeAtNight());


    }
}

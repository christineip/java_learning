package com.chris.learning;

import java.nio.channels.DatagramChannel;

public class MyOverloadedClass {
    public static void main(String[] args) {
        ParentOverload a = new ParentOverload();
        ChildOverload b = new ChildOverload();
        ParentOverload c = new ChildOverload();
        // ChildOverload d=new ParentOverload(); incorrect as ParentOverload
        a.m1();
        //Calling Parent
        b.m1();
        //Calling Child
        c.m1();
        //Calling Child

        //method overloading
        b.method1("christine");
        b.method1(1);
    }
}

class ParentOverload {
    public ParentOverload m1() {
        System.out.println("Calling Parent");
        return null;
    }
}

class ChildOverload extends ParentOverload {
    public ChildOverload method1(String a) {
        System.out.println("I am in the String Type");
        return null;
    }

    public ChildOverload method1(int a) {
        System.out.println("I am in the Integer Type");
        return null;
    }

    public ParentOverload m1() {
        System.out.println("Calling Child");
        return null;
    }
}



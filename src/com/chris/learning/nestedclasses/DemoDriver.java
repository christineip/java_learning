package com.chris.learning.nestedclasses;

public class DemoDriver {

    public static void main(String[] args) {
        NestedDemo nested = new NestedDemo();
        NestedDemo.AbcInside inside = new NestedDemo.AbcInside();
        NestedDemo.AbcInside element = nested.entrySet();
    }
}

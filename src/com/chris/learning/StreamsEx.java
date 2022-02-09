package com.chris.learning;

import java.util.Arrays;

public class StreamsEx {

    public static void main(String[] args) {
        String[] names = {"Anil", "Christine", "naveen", "Jimmy", "Mantika"};

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + "   ");
        }
        System.out.println();

        for (String name : names) {
            System.out.print(name + "   ");
        }
        System.out.println();
        Arrays.stream(names).forEach(System.out::print);
    }
}

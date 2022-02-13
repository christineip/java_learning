package com.chris.learning;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
        List<Student> a = List.of(new Student(1, "Christine"), new Student(44, "Anil"), new Student(3, "Naveen"));
        ArrayList<Student> listStudent=new ArrayList<>(a);

        System.out.println(listStudent);
        for(Student eachStudent : listStudent){
            eachStudent.printShit();
        }

        //Comparator();
    }

}

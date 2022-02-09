package com.chris.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FlyRunner {
    public static void main(String[] args) {
        Bird christine = new Bird();
        Aeroplane chris = new Aeroplane();
        Flyable[] christineip = {new Bird(), new Aeroplane()};
        for (Flyable f : christineip
        ) {
            f.fly();
        }

        String[] a = {"christine", "anil", "naveen"};
        List<String> listA = List.of(a);
        List<String> listB = new ArrayList<>();
        listB.add("nitin");
        System.out.println(listA);
        System.out.println(listB);
        listA.size();

        Integer[] b={3,2,4,5};
        List<Integer> listC=List.of(b);
        Iterator iteratorC=listC.iterator();

        while(iteratorC.hasNext()){
            System.out.print(iteratorC.next() + " ");
        }

        String[] abc={"Cat","Dog","Bat"};
        List<String> animalA=new ArrayList<String>();
        Iterator loop= animalA.iterator();
        if(loop.hasNext() ){
     /*       if(loop.next().endsWith("at")){

                iteratorC.remove();

            }*/
        }

    }
}

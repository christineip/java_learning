package com.chris.learning.compare;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ItemRunner {

    public static void main(String[] args) {
        Item mobile = new Item(1, "Apple", 10);
        Item food = new Item(2, "Christine", 1);
        Item mug = new Item(3, "ChinaMug", 10);
        Item chair = new Item(4, "Apple", 10);

        List<Item> itemList = new ArrayList<>();
        itemList.add(chair);
        itemList.add(mug);
        itemList.add(mobile);
        itemList.add(food);


/*        System.out.println(itemList);
        Collections.reverse(itemList);
        System.out.println(itemList);
        //Collections.sort(itemList);


        Collections.sort(itemList,Collections.reverseOrder());
        System.out.println(itemList);*/
        System.out.println(itemList);

        Collections.sort(itemList, new ItemComparator());
        System.out.println(itemList);
        Collections.sort(itemList, new ItemQuantityComparator());

        System.out.println(itemList);
        Collections.reverse(itemList);
        System.out.println(itemList);
    }
}

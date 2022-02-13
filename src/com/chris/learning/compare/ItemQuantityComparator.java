package com.chris.learning.compare;

import java.util.Comparator;

public class ItemQuantityComparator implements Comparator<Item> {
    public int compare(Item itemA, Item itemB){
        return Integer.compare(itemA.getItemQty(), itemB.getItemQty());
    }
}

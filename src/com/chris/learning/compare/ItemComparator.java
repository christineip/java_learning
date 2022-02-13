package com.chris.learning.compare;

import java.util.Comparator;

public class ItemComparator implements Comparator<Item> {
    @Override
    public int compare(Item item1, Item item2) {
        return item1.getItemName().compareTo(item2.getItemName());
    }

}

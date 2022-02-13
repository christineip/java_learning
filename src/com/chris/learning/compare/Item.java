package com.chris.learning.compare;

public class Item /*implements Comparable<Item>*/{

    private int itemCode;
    private String itemName;
    private int itemQty;

    public int getItemCode() {

        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemQty() {
        return itemQty;
    }

    public void setItemQty(int itemQty) {
        this.itemQty = itemQty;
    }

    public Item() {
    }

    public Item(int itemCode, String itemName, int itemQty) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.itemQty = itemQty;
    }

   /* @Override
    public int compareTo(Item o) {
        return Integer.compare(this.itemCode,o.itemCode);
    }

*/


    @Override
    public String toString() {
        return "Item{" +
                "itemCode=" + itemCode +
                ", itemName='" + itemName + '\'' +
                ", itemQty=" + itemQty +
                '}';
    }
}

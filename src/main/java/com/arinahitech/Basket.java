package com.arinahitech;

public class Basket {

    private Item[] items;
    private int index = -1;


    public Basket() {
        this.items = new Item[10];
    }

    public void addItem(Item item) {
        if (index < items.length) {
            index++;
            items[index] = item;
        }
    }

    public Item[] getItems() {
        Item[] itemsFull = null;
        if (index != -1) {
            itemsFull = new Item[index + 1];
            for (int i = 0; i < itemsFull.length; i++) {
                itemsFull[i] = items[i];
            }
        }
        return itemsFull;
    }
}

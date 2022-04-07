package com.arinahitech;

public class Item {

    private String title;
    private int count;

    public Item(String name, int count) {
        this.title = name;
        this.count = count;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

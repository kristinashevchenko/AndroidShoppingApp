package com.example.shoppingapp;

public class ShoppingItem {
    String title;
    String subtitle;

    String image;

    public ShoppingItem(String title, String subtitle, String image) {
        this.title = title;
        this.subtitle = subtitle;
        this.image = image;

    }

    public String getTitle() {
        return this.title;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public String getImage() {
        return this.image;
    }

    @Override
    public String toString() {
        return this.title;
    }
}

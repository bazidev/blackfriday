package com.indev.blackfriday;

public class Product {

    private int quantity;
    private int price;

    public Product(int quantity, int price) {
        this.quantity = quantity;
        this.price = price;
    }

    public int countAsserts(){
        return quantity*price;
    }
}

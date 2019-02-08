package com.indev.blackfriday;

public class Product {

    private int quantity;
    private float price;
    private float asserts;

    public Product(int quantity, float price) {
        this.quantity = quantity;
        this.price = price;
        this.asserts = quantity*price;
    }

    public float countAsserts(){
        return asserts;
    }

    public float sells(){
        updateAssetrs();
        return (float) (5*price+5*price*0.2);
    }

    private void updateAssetrs() {
        asserts = (float) (asserts + 5*price*0.2);
    }
}

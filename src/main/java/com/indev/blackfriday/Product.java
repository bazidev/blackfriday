package com.indev.blackfriday;

public class Product {

    private int quantity;
    private float price;
    private float asserts;
    private boolean isBlackFriday;

    public Product(int quantity, float price) {
        this.quantity = quantity;
        this.price = price;
        this.asserts = quantity * price;
    }

    public float countAsserts() {
        return asserts;
    }

    public float sells(boolean isBlackFriday) {
        if (isBlackFriday) {
            updateBlackFridayQuantity();
            updateBlackFridayAssetrs();
            return (float) (10 * price + 10 * price * 0.1);
        }
        else{
            updateQuantity();
            updateAssetrs();
            return (float) (5 * price + 5 * price * 0.2);
        }
    }

    private void updateBlackFridayQuantity() {
        if (quantity < 10) {
            throw new RuntimeException(quantity + " is not enough");
        }
        quantity = quantity - 10;

    }

    private void updateBlackFridayAssetrs() {
        asserts = (float) (asserts + 10 * price * 0.1);
    }

    private void updateQuantity() {
        if (quantity < 5) {
            throw new RuntimeException(quantity + " is not enough");
        }
        quantity = quantity - 5;
    }

    private void updateAssetrs() {
        asserts = (float) (asserts + 5 * price * 0.2);
    }
}

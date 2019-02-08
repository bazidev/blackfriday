package com.indev.blackfriday;

public class Company {

    Capsule capsule;
    Machine machine;

    public float sells(String capsule) {
        return 0;
    }

    public void stock(int price, String product, int quantity) {
        if (product.equals("machine")) {
            machine = new Machine(quantity, price);

        } else if (product.equals("capsule")) {
            capsule = new Capsule(quantity, price);
        } else {
            throw new IllegalArgumentException(product + " is not a valid product name");
        }
    }

    public Company to(int i) {
        return this;
    }

    public float computeBenefit() {
        return 0;
    }

    public int totalAssets() {
        return capsuleAssert() + machineAssert();
    }

    private int machineAssert() {
        if (machine != null) {
            return machine.countAsserts();
        }
        return 0;
    }


    private int capsuleAssert() {
        if (capsule != null) {
            return capsule.countAsserts();
        }
        return 0;
    }


    public Company blackFriday() {
        return this;
    }
}

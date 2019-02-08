package com.indev.blackfriday;

public class Company {

    Capsule capsule;
    Machine machine;
    boolean isBlackFriday = false;

    public float sells(String product) {
        if (product.equals("machine")) {
            return machine.sells(isBlackFriday);
        } else if (product.equals("capsule")) {
            return capsule.sells(isBlackFriday);
        } else {
            throw new IllegalArgumentException(product + " is not a valid product name");
        }
    }

    public void stock(int quantity, String product, int price) {
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
            return (int) machine.countAsserts();
        }
        return 0;
    }


    private int capsuleAssert() {
        if (capsule != null) {
            return (int) capsule.countAsserts();
        }
        return 0;
    }


    public Company blackFriday() {
        this.isBlackFriday = true;
        return  this;
    }
}

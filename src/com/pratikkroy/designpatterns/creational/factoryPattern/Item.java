package com.pratikkroy.designpatterns.creational.factoryPattern;

public class Item {
    private final String deliveredBy;

    public Item(final String deliveredBy) {
        this.deliveredBy = deliveredBy;
    }

    public String getDeliveredBy() {
        return deliveredBy;
    }
}

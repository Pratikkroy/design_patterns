package com.pratikkroy.designpatterns.creational.abstractFactoryPattern;

public class Item {
    private final String type;
    private final String color;

    public Item(final String type, final String color) {
        this.type = type;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }
}

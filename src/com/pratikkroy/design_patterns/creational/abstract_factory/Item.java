package com.pratikkroy.design_patterns.creational.abstract_factory;

public class Item {

    private String type;
    private String color;

    public Item(String type, String color){
        this.type = type;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }
}

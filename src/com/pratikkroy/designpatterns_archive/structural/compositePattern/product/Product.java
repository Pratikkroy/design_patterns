package com.pratikkroy.designpatterns.structural.compositePattern.product;

public class Product implements Component{

    private final double price;

    public Product(final double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}

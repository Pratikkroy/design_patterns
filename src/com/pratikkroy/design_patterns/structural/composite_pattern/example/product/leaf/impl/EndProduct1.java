package com.pratikkroy.design_patterns.structural.composite_pattern.example.product.leaf.impl;

import com.pratikkroy.design_patterns.structural.composite_pattern.example.product.leaf.EndProduct;

public class EndProduct1 implements EndProduct {

    private String name;
    private double price;

    public EndProduct1(final String name, final double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}

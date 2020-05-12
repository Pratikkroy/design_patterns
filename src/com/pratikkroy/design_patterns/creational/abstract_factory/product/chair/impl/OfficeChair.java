package com.pratikkroy.design_patterns.creational.abstract_factory.product.chair.impl;

import com.pratikkroy.design_patterns.creational.abstract_factory.product.chair.Chair;

public class OfficeChair extends Chair {

    public static final String materialMadeOf = "PLASTIC";
    public OfficeChair(final String color) {
        super(color, materialMadeOf);
    }

    @Override
    public void sitOn() {
        System.out.println("Very comfortable and flexible");
    }

    @Override
    public String toString() {
        return "OfficeChair{}";
    }
}

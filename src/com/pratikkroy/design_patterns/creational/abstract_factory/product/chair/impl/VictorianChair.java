package com.pratikkroy.design_patterns.creational.abstract_factory.product.chair.impl;

import com.pratikkroy.design_patterns.creational.abstract_factory.product.chair.Chair;

public class VictorianChair extends Chair {

    public static final String materialMadeOf = "WOOD";
    public VictorianChair(String color) {
        super(color, materialMadeOf);
    }

    @Override
    public void sitOn() {
        System.out.println("Can be sit comfortably");
    }

    @Override
    public String toString() {
        return "VictorianChair{}";
    }
}

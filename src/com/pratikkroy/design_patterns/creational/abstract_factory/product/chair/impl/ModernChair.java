package com.pratikkroy.design_patterns.creational.abstract_factory.product.chair.impl;

import com.pratikkroy.design_patterns.creational.abstract_factory.product.chair.Chair;

public class ModernChair extends Chair {

    public static final String materialMadeOf = "PLASTIC";
    public ModernChair(final String color) {
        super(color, materialMadeOf);
    }

    @Override
    public void sitOn() {
        System.out.println("Not so comfortable");
    }

    @Override
    public String toString() {
        return "ModernChair{}";
    }
}


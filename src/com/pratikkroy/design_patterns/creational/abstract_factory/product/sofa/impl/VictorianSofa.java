package com.pratikkroy.design_patterns.creational.abstract_factory.product.sofa.impl;

import com.pratikkroy.design_patterns.creational.abstract_factory.product.sofa.Sofa;

public class VictorianSofa extends Sofa {

    public static final String materialMadeOf = "WOOD";

    public VictorianSofa(final String color) {
        super(color, materialMadeOf);
    }

    @Override
    public void uses() {
        String[] uses = {
                "Used to decorate home.",
                "Used to sit on it."
        };

        for(String use: uses){
            System.out.println(use);
        }
    }

    @Override
    public String toString() {
        return "VictorianSofa{}";
    }
}

package com.pratikkroy.design_patterns.creational.abstract_factory.product.sofa.impl;

import com.pratikkroy.design_patterns.creational.abstract_factory.product.sofa.Sofa;

public class OfficeSofa extends Sofa {

    public static final String materialMadeOf = "PLASTIC";

    public OfficeSofa(final String color) {
        super(color, materialMadeOf);
    }

    @Override
    public void uses() {
        String[] uses = {
                "Used in office.",
                "Used to sit on it."
        };

        for(String use: uses){
            System.out.println(use);
        }
    }

    @Override
    public String toString() {
        return "OfficeSofa{}";
    }
}

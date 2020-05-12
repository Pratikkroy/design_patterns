package com.pratikkroy.design_patterns.creational.abstract_factory.product.table.impl;

import com.pratikkroy.design_patterns.creational.abstract_factory.product.table.Table;

public class ModernTable extends Table {

    public static final String materialMadeOf = "PLASTIC";

    public ModernTable(final String color) {
        super(color, materialMadeOf);
    }

    @Override
    public void uses() {
        String[] uses = {
                "Used to place things on it."
        };

        for(String use: uses){
            System.out.println(use);
        }
    }

    @Override
    public String toString() {
        return "ModernTable{}";
    }
}

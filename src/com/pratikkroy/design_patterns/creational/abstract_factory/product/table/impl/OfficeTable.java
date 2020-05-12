package com.pratikkroy.design_patterns.creational.abstract_factory.product.table.impl;

import com.pratikkroy.design_patterns.creational.abstract_factory.product.table.Table;

public class OfficeTable extends Table {

    public static final String materialMadeOf = "PLASTIC";

    public OfficeTable(final String color) {
        super(color, materialMadeOf);
    }

    @Override
    public void uses() {
        String[] uses = {
                "Used in offices",
                "Used to place things on it."
        };

        for(String use: uses){
            System.out.println(use);
        }
    }

    @Override
    public String toString() {
        return "OfficeTable{}";
    }
}

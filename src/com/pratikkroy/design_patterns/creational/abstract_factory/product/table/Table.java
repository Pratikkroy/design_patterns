package com.pratikkroy.design_patterns.creational.abstract_factory.product.table;

public abstract class Table {

    String color;
    String materialMadeOf;

    public Table(final String color, final String materialMadeOf) {
        this.color = color;
        this.materialMadeOf = materialMadeOf;
    }

    public abstract void uses();

    @Override
    public String toString() {
        return "Table{" + "color='" + color + '\'' + ", materialMadeOf='" + materialMadeOf + '\'' + '}';
    }
}

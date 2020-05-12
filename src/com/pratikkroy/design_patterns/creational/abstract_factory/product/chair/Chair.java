package com.pratikkroy.design_patterns.creational.abstract_factory.product.chair;

public abstract class Chair {
    String color;
    String materialMadeOf;

    public Chair(final String color, final String materialMadeOf) {
        this.color = color;
        this.materialMadeOf = materialMadeOf;
    }

    public abstract void sitOn();

    @Override
    public String toString() {
        return "Chair{" + "color='" + color + '\'' + ", materialMadeOf='" + materialMadeOf + '\'' + '}';
    }
}

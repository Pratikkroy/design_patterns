package com.pratikkroy.design_patterns.creational.abstract_factory.product.sofa;

public abstract class Sofa {

    String color;
    String materialMadeOf;

    public Sofa(final String color, final String materialMadeOf) {
        this.color = color;
        this.materialMadeOf = materialMadeOf;
    }

    public abstract void uses();

    @Override
    public String toString() {
        return "Sofa{" + "color='" + color + '\'' + ", materialMadeOf='" + materialMadeOf + '\'' + '}';
    }
}

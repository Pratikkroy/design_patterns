package com.pratikkroy.designpatterns.creational.abstractFactoryPattern.product.chair;

public class ModernChair implements Chair {

    public static final String materialMadeOf = "PLASTIC";
    private final String color;

    public ModernChair(final String color) {
        this.color = color;
    }

    @Override
    public void sitOn() {
        System.out.println(
                String.format("Sitting on %s chair. Its very cheap.", materialMadeOf));
    }

    @Override
    public String toString() {
        return "ModernChair{"
                + "color='" + color + '\''
                + "materialMadeOf='" + materialMadeOf + '\''
                + '}';
    }
}


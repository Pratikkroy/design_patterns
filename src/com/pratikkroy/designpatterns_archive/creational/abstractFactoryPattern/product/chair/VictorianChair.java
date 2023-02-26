package com.pratikkroy.designpatterns.creational.abstractFactoryPattern.product.chair;


public class VictorianChair implements Chair {

    public static final String materialMadeOf = "WOOD";
    private final String color;

    public VictorianChair(final String color) {
        this.color = color;
    }

    @Override
    public void sitOn() {
        System.out.println(
                String.format("Sitting on %s chair. Its very comfortable.", materialMadeOf));
    }

    @Override
    public String toString() {
        return "VictorianChair{"
                + "color='" + color + '\''
                + "materialMadeOf='" + materialMadeOf + '\''
                + '}';
    }
}

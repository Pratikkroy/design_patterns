package com.pratikkroy.designpatterns.creational.abstractFactoryPattern.product.sofa;

public class VictorianSofa implements Sofa {

    public static final String materialMadeOf = "WOOD";
    private final String color;

    public VictorianSofa(final String color) {
        this.color = color;
    }

    @Override
    public void relaxing() {
        System.out.println(
                String.format("Relaxing on %s chair. Its very comfortable.", materialMadeOf));
    }

    @Override
    public String toString() {
        return "VictorianSofa{"
                + "color='" + color + '\''
                + "materialMadeOf='" + materialMadeOf + '\''
                + '}';
    }
}

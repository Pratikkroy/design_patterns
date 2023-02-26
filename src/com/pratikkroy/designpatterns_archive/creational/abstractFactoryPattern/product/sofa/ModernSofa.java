package com.pratikkroy.designpatterns.creational.abstractFactoryPattern.product.sofa;

public class ModernSofa implements Sofa {

    public static final String materialMadeOf = "PLASTIC";
    private final String color;

    public ModernSofa(final String color) {
        this.color = color;
    }

    @Override
    public void relaxing() {
        System.out.println(
                String.format("Relaxing on %s chair. Its very cheap.", materialMadeOf));
    }

    @Override
    public String toString() {
        return "ModernSofa{"
                + "color='" + color + '\''
                + "materialMadeOf='" + materialMadeOf + '\''
                + '}';
    }
}

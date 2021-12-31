package com.pratikkroy.designpatterns.creational.abstractFactoryPattern.product.sofa;

public class ArtDecoSofa implements Sofa {

    public static final String materialMadeOf = "CLOTH";
    private final String color;

    public ArtDecoSofa(final String color) {
        this.color = color;
    }

    @Override
    public void relaxing() {
        System.out.println(
                String.format("Relaxing on %s chair. Its very beautiful.", materialMadeOf));
    }

    @Override
    public String toString() {
        return "ArtDecoSofa{"
                + "color='" + color + '\''
                + "materialMadeOf='" + materialMadeOf + '\''
                + '}';
    }
}

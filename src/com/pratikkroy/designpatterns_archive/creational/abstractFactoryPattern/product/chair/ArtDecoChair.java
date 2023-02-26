package com.pratikkroy.designpatterns.creational.abstractFactoryPattern.product.chair;

public class ArtDecoChair implements Chair {

    public static final String materialMadeOf = "CLOTH";
    private final String color;

    public ArtDecoChair(final String color) {
        this.color = color;
    }

    @Override
    public void sitOn() {
        System.out.println(
                String.format("Sitting on %s chair. Its very beautiful.", materialMadeOf));
    }

    @Override
    public String toString() {
        return "ArtDecoChair{"
                + "color='" + color + '\''
                + "materialMadeOf='" + materialMadeOf + '\''
                + '}';
    }

}

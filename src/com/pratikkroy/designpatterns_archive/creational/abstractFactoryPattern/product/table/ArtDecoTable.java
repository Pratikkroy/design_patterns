package com.pratikkroy.designpatterns.creational.abstractFactoryPattern.product.table;

public class ArtDecoTable implements Table {

    public static final String materialMadeOf = "CLOTH";
    private final String color;

    public ArtDecoTable(final String color) {
        this.color = color;
    }

    @Override
    public void using() {
        System.out.println(
                String.format("Using %s table. Its very beautiful.", materialMadeOf));
    }

    @Override
    public String toString() {
        return "ArtDecoTable{"
                + "color='" + color + '\''
                + "materialMadeOf='" + materialMadeOf + '\''
                + '}';
    }
}

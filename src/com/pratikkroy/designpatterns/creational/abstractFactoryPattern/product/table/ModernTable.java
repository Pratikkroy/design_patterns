package com.pratikkroy.designpatterns.creational.abstractFactoryPattern.product.table;

public class ModernTable implements Table {

    public static final String materialMadeOf = "PLASTIC";
    private final String color;

    public ModernTable(final String color) {
        this.color = color;
    }

    @Override
    public void using() {
        System.out.println(
                String.format("Using %s table. Its very cheap.", materialMadeOf));
    }

    @Override
    public String toString() {
        return "ModernTable{"
                + "color='" + color + '\''
                + "materialMadeOf='" + materialMadeOf + '\''
                + '}';
    }

}

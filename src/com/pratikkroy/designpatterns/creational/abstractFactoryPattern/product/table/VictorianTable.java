package com.pratikkroy.designpatterns.creational.abstractFactoryPattern.product.table;

public class VictorianTable implements Table {

    public static final String materialMadeOf = "WOOD";
    private final String color;

    public VictorianTable(final String color) {
        this.color = color;
    }

    @Override
    public void using() {
        System.out.println(
                String.format("Using %s table. Its very comfortable to use.", materialMadeOf));
    }

    @Override
    public String toString() {
        return "VictorianTable{"
                + "color='" + color + '\''
                + "materialMadeOf='" + materialMadeOf + '\''
                + '}';
    }

}

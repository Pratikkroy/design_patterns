package com.pratikkroy.designpatterns.creational.abstractFactoryPattern.director;

import com.pratikkroy.designpatterns.creational.abstractFactoryPattern.Item;
import com.pratikkroy.designpatterns.creational.abstractFactoryPattern.factory.ArtDecoFurnitureFactory;
import com.pratikkroy.designpatterns.creational.abstractFactoryPattern.factory.FurnitureFactory;
import com.pratikkroy.designpatterns.creational.abstractFactoryPattern.factory.ModernFurnitureFactory;
import com.pratikkroy.designpatterns.creational.abstractFactoryPattern.factory.VictorianFurnitureFactory;
import com.pratikkroy.designpatterns.creational.abstractFactoryPattern.product.chair.Chair;
import com.pratikkroy.designpatterns.creational.abstractFactoryPattern.product.sofa.Sofa;
import com.pratikkroy.designpatterns.creational.abstractFactoryPattern.product.table.Table;

public class FurnitureFactoryDirector {

    private final FurnitureFactory furnitureFactory;

    public FurnitureFactoryDirector (final String type) {
        switch (type) {
            case "MODERN": this.furnitureFactory = new ModernFurnitureFactory(); break;
            case "ART_DECO": this.furnitureFactory = new ArtDecoFurnitureFactory(); break;
            case "VICTORIAN": this.furnitureFactory = new VictorianFurnitureFactory(); break;
            default: this.furnitureFactory = new ModernFurnitureFactory(); break;
        }
    }

    public Chair createChair(final Item item) {
        return this.furnitureFactory.createChair(item.getColor());
    }

    public Sofa createSofa(final Item item) {
        return this.furnitureFactory.createSofa(item.getColor());
    }

    public Table createTable(final Item item) {
        return this.furnitureFactory.createTable(item.getColor());
    }
}

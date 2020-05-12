package com.pratikkroy.design_patterns.creational.abstract_factory.director;

import com.pratikkroy.design_patterns.creational.abstract_factory.Item;
import com.pratikkroy.design_patterns.creational.abstract_factory.factory.FurnitureFactory;
import com.pratikkroy.design_patterns.creational.abstract_factory.factory.impl.ModernFurnitureFactory;
import com.pratikkroy.design_patterns.creational.abstract_factory.factory.impl.OfficeFurnitureFactory;
import com.pratikkroy.design_patterns.creational.abstract_factory.factory.impl.VictorianFurnitureFactory;
import com.pratikkroy.design_patterns.creational.abstract_factory.product.chair.Chair;
import com.pratikkroy.design_patterns.creational.abstract_factory.product.furniture.Furniture;
import com.pratikkroy.design_patterns.creational.abstract_factory.product.sofa.Sofa;
import com.pratikkroy.design_patterns.creational.abstract_factory.product.table.Table;

public class FurnitureDirector {

    private final Item item;

    public FurnitureDirector(Item item){
        this.item = item;
    }

    public Furniture createFurniture(){
        FurnitureFactory furnitureFactory = this.getFurnitureFactory(item);
        String color = item.getColor();
        return new Furniture(
                furnitureFactory.createChair(color),
                furnitureFactory.createTable(color),
                furnitureFactory.createSofa(color)
        );
    }

    private FurnitureFactory getFurnitureFactory(Item item){
        switch(item.getType()){
            case "VICTORIAN" :
                return new VictorianFurnitureFactory();
            case "MODERN" :
                return new ModernFurnitureFactory();
            case "OFFICE" :
                return new OfficeFurnitureFactory();
            default :
                return new ModernFurnitureFactory();
        }
    }

    public Chair createChair(){
        FurnitureFactory furnitureFactory = this.getFurnitureFactory(item);
        String color = item.getColor();
        return furnitureFactory.createChair(color);
    }

    public Table createTable(){
        FurnitureFactory furnitureFactory = this.getFurnitureFactory(item);
        String color = item.getColor();
        return furnitureFactory.createTable(color);
    }

    public Sofa createSofa(){
        FurnitureFactory furnitureFactory = this.getFurnitureFactory(item);
        String color = item.getColor();
        return furnitureFactory.createSofa(color);
    }
}

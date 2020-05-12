package com.pratikkroy.design_patterns.creational.abstract_factory;

import com.pratikkroy.design_patterns.creational.abstract_factory.director.FurnitureDirector;
import com.pratikkroy.design_patterns.creational.abstract_factory.product.chair.Chair;
import com.pratikkroy.design_patterns.creational.abstract_factory.product.furniture.Furniture;

public class AbstractFactoryDemo {
    public static void demo(){
        System.out.println();
        System.out.println("Abstract factory pattern existing_use.....");

        String type = "OFFICE";
        String color = "BROWN";
        Item item = new Item(type, color);


        // if want to create a set of furniture
        FurnitureDirector director = new FurnitureDirector(item);
        Furniture furniture = director.createFurniture();
        System.out.println(furniture);


        type = "VICTORIAN";
        color = "RED";
        item = new Item(type, color);
        // if want to create a particular furniture
        // ex: VictorianChair
        director = new FurnitureDirector(item);
        Chair chair = director.createChair();
        System.out.println(chair);
    }
}

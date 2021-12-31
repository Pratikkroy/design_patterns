package com.pratikkroy.designpatterns.creational.abstractFactoryPattern;

import com.pratikkroy.designpatterns.creational.abstractFactoryPattern.director.FurnitureFactoryDirector;
import com.pratikkroy.designpatterns.creational.abstractFactoryPattern.product.chair.Chair;
import com.pratikkroy.designpatterns.creational.abstractFactoryPattern.product.sofa.Sofa;
import com.pratikkroy.designpatterns.creational.abstractFactoryPattern.product.table.Table;

public class AbstractFactoryPatternDemo {

    public static void start(){

        final String type = "VICTORIAN";
        final String color = "BROWN";

        System.out.println("Creating a new item with type=" + type + " and color=" + color);
        final Item item = new Item(type, color);

        final FurnitureFactoryDirector director = new FurnitureFactoryDirector(item.getType());

        final Chair chair = director.createChair(item);
        chair.sitOn();

        final Sofa sofa = director.createSofa(item);
        sofa.relaxing();

        final Table table = director.createTable(item);
        table.using();


    }
}

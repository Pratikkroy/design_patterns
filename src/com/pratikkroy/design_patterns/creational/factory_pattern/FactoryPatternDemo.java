package com.pratikkroy.design_patterns.creational.factory_pattern;

import com.pratikkroy.design_patterns.creational.factory_pattern.director.LogisticsDirector;

public class FactoryPatternDemo {
    public static void demo(){
        System.out.println();
        System.out.println("Factory pattern existing_use.....");
        Item seaItem = new Item("SEA");
        LogisticsDirector logisticsDirector = new LogisticsDirector(seaItem);
        logisticsDirector.deliverItem();
        System.out.println(logisticsDirector.getTransport());

        Item roadItem = new Item("ROAD");
        logisticsDirector = new LogisticsDirector(roadItem);
        logisticsDirector.deliverItem();
        System.out.println(logisticsDirector.getTransport());
    }
}

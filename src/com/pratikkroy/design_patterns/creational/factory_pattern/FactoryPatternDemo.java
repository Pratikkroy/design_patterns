package com.pratikkroy.design_patterns.creational.factory_pattern;

import com.pratikkroy.design_patterns.creational.factory_pattern.client.LogisticsClient;


public class FactoryPatternDemo {
    public static void demo(){
        LogisticsClient client = new LogisticsClient();

        Item seaItem = new Item("SEA");
        client.deliverItem(seaItem);
        System.out.println(client.getTransport(seaItem));

        Item roadItem = new Item("ROAD");
        client.deliverItem(roadItem);
        System.out.println(client.getTransport(roadItem));
    }
}

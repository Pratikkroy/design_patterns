package com.pratikkroy.design_patterns.structural.composite_pattern.example.client;

import com.pratikkroy.design_patterns.structural.composite_pattern.example.product.component.Item;
import com.pratikkroy.design_patterns.structural.composite_pattern.example.product.composite.Box;
import com.pratikkroy.design_patterns.structural.composite_pattern.example.product.leaf.impl.EndProduct1;

import java.util.ArrayList;
import java.util.List;

/**
 *      ________ box ________
 *     |          |          |
 *    box1     _ box2 _    item1
 *     |      |        |
 *   item2   box3     box4
 *            |        |
 *          item3    item4
 */
public class BoxPriceDemo {
    static Box mainBox;

    public static void createMainBox(){
        Item item1 = new EndProduct1("Item1", 10);
        Item item2 = new EndProduct1("Item2", 10);
        Item item3 = new EndProduct1("Item3", 30);
        Item item4 = new EndProduct1("Item4", 40);

        Box box = new Box();
        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();
        Box box4 = new Box();

        List<Item> boxItems = new ArrayList<>();
        boxItems.add(box1);
        boxItems.add(box2);
        boxItems.add(item1);

        box.add(boxItems);

        box1.add(item2);

        List<Item> box2Items = new ArrayList<>();
        box2Items.add(item3);
        box2Items.add(item4);

        box2.add(box2Items);

        box3.add(item3);

        box4.add(item4);

        mainBox = box;
    }

    public static double getBoxPrice(){
        double price = mainBox.getPrice();

        System.out.println("Main box price = "+price);

        return price;
    }
}

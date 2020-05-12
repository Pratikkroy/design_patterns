package com.pratikkroy.design_patterns.structural.composite_pattern.example.product.composite;

import com.pratikkroy.design_patterns.structural.composite_pattern.example.product.component.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box implements Item {

    private List<Item> underlyingBoxes;

    public Box(){
        underlyingBoxes = new ArrayList<>();
    }

    @Override
    public double getPrice() {
        double totalPrice = 0;
        for(Item item: underlyingBoxes){
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void add(Item item){
        underlyingBoxes.add(item);
    }

    public void add(List<Item> items){
        underlyingBoxes.addAll(items);
    }

    public void remove(Item item){
        underlyingBoxes.remove(item);
    }

    public void remove(List<Item> items){
        underlyingBoxes.removeAll(items);
    }

    public List getChildern(){
        return underlyingBoxes;
    }
}

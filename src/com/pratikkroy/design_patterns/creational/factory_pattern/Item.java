package com.pratikkroy.design_patterns.creational.factory_pattern;

public class Item {
    private String delievrBy;

    public Item(String deliverBy){
        this.delievrBy = deliverBy;
    }

    public String getDelievrBy() {
        return delievrBy;
    }
}

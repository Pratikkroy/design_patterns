package com.pratikkroy.designpatterns.structural.compositePattern.product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Container implements Component {

    private final List<Component> componentList = new ArrayList<>();

    @Override
    public double getPrice() {
        double price = 0;
        for (Component component: componentList) {
            price += component.getPrice();
        }
        return price;
    }

    public void addComponent(final Component component) {
        this.componentList.add(component);
    }

    public void removeComponent(final Component component) {
        int index = -1;
        for (int i=0; i<this.componentList.size(); i++) {
            if (component.equals(componentList.get(i))) {
                index = i;
                break;
            }
        }

        if (index >= 0)
            this.componentList.remove(index);
    }

    public List<Component> getComponentList() {
        return Collections.unmodifiableList(componentList);
    }

}

package com.pratikkroy.design_patterns.structural.composite_pattern.blue_print.component.impl;

import com.pratikkroy.design_patterns.structural.composite_pattern.blue_print.component.Component;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private List<Component> children;

    public Composite(){
        children = new ArrayList<>();
    }
    
    @Override
    public void execute() {
        for(Component component:children){
            component.execute();
        }
    }

    public void add(Component component){
        children.add(component);
    }

    public void add(List<Component> components){
        children.addAll(components);
    }

    public void remove(Component component){
        children.remove(component);
    }

    public void remove(List<Component> components){
        children.removeAll(components);
    }

    public List getChildern(){
        return children;
    }
}
    

    

    

    
package com.pratikkroy.design_patterns.behavioural.visitor_pattern.product;

import com.pratikkroy.design_patterns.behavioural.visitor_pattern.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class CompoundShape extends Shape {

    final private List<Shape> shapeList = new ArrayList<>();

    public void addShape(final Shape... shape) {
        shapeList.addAll(List.of(shape));
    }

    public void removeShapeAt(final int index) {
        if (index >= shapeList.size()) {
            return;
        }

        shapeList.remove(index);
    }

    public List<Shape> getShapeList() {
        return shapeList;
    }

    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
}

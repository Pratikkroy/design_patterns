package com.pratikkroy.design_patterns.behavioural.visitor_pattern.product;

import com.pratikkroy.design_patterns.behavioural.visitor_pattern.visitor.Visitor;

public abstract class Shape implements Graphic {

    @Override
    public void draw() {
        System.out.println("Drawing Shape");
    }

    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
}

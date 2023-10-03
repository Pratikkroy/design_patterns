package com.pratikkroy.design_patterns.behavioural.visitor_pattern.product;

import com.pratikkroy.design_patterns.behavioural.visitor_pattern.visitor.Visitor;

public class Square extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
}

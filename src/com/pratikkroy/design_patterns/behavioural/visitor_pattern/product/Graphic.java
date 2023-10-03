package com.pratikkroy.design_patterns.behavioural.visitor_pattern.product;

import com.pratikkroy.design_patterns.behavioural.visitor_pattern.visitor.Visitor;

public interface Graphic {

    void draw();

    void accept(Visitor visitor);
}

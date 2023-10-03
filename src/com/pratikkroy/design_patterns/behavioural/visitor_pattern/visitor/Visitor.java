package com.pratikkroy.design_patterns.behavioural.visitor_pattern.visitor;

import com.pratikkroy.design_patterns.behavioural.visitor_pattern.product.Circle;
import com.pratikkroy.design_patterns.behavioural.visitor_pattern.product.CompoundShape;
import com.pratikkroy.design_patterns.behavioural.visitor_pattern.product.Dot;
import com.pratikkroy.design_patterns.behavioural.visitor_pattern.product.Rectangle;
import com.pratikkroy.design_patterns.behavioural.visitor_pattern.product.Shape;
import com.pratikkroy.design_patterns.behavioural.visitor_pattern.product.Square;

public interface Visitor {

    void visit(Shape shape);

    void visit(Dot dot);

    void visit(Circle circle);

    void visit(Square square);

    void visit(Rectangle rectangle);

    void visit(CompoundShape compoundShape);
}

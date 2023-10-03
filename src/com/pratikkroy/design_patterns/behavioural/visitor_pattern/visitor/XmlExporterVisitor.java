package com.pratikkroy.design_patterns.behavioural.visitor_pattern.visitor;

import com.pratikkroy.design_patterns.behavioural.visitor_pattern.product.Circle;
import com.pratikkroy.design_patterns.behavioural.visitor_pattern.product.CompoundShape;
import com.pratikkroy.design_patterns.behavioural.visitor_pattern.product.Dot;
import com.pratikkroy.design_patterns.behavioural.visitor_pattern.product.Rectangle;
import com.pratikkroy.design_patterns.behavioural.visitor_pattern.product.Shape;
import com.pratikkroy.design_patterns.behavioural.visitor_pattern.product.Square;

public class XmlExporterVisitor implements Visitor {

    @Override
    public void visit(final Shape shape) {
        System.out.println("Exporting shape to XML");
    }

    @Override
    public void visit(final Dot dot) {
        System.out.println("Exporting dot to XML");
    }

    @Override
    public void visit(final Circle circle) {
        System.out.println("Exporting circle to XML");
    }

    @Override
    public void visit(final Square square) {
        System.out.println("Exporting square to XML");
    }

    public void visit(final Rectangle rectangle) {
        System.out.println("Exporting rectangle to XML");
    }

    public void visit(final CompoundShape compoundShape) {
        for (Shape shape: compoundShape.getShapeList()) {
            shape.accept(this);
        }
    }
}

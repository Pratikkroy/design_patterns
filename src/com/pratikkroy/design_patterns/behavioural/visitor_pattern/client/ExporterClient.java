package com.pratikkroy.design_patterns.behavioural.visitor_pattern.client;

import com.pratikkroy.design_patterns.behavioural.visitor_pattern.product.Circle;
import com.pratikkroy.design_patterns.behavioural.visitor_pattern.product.CompoundShape;
import com.pratikkroy.design_patterns.behavioural.visitor_pattern.product.Dot;
import com.pratikkroy.design_patterns.behavioural.visitor_pattern.product.Rectangle;
import com.pratikkroy.design_patterns.behavioural.visitor_pattern.product.Shape;
import com.pratikkroy.design_patterns.behavioural.visitor_pattern.visitor.JsonExporterVisitor;
import com.pratikkroy.design_patterns.behavioural.visitor_pattern.visitor.Visitor;
import com.pratikkroy.design_patterns.behavioural.visitor_pattern.visitor.XmlExporterVisitor;

public class ExporterClient {

    public static void demo() {
        exportToJson();
    }

    private static void exportToJson() {

        Visitor jsonExporterVisitor = new JsonExporterVisitor();

        final Shape circle = new Circle();
        circle.accept(jsonExporterVisitor);

        final Shape rectangle = new Rectangle();
        rectangle.accept(jsonExporterVisitor);

        final Shape dot = new Dot();
        dot.accept(jsonExporterVisitor);


        Visitor xmlExporterVisitor = new XmlExporterVisitor();

        final CompoundShape compoundShape = new CompoundShape();
        compoundShape.addShape(circle, rectangle, dot);

        compoundShape.accept(xmlExporterVisitor);

    }
}

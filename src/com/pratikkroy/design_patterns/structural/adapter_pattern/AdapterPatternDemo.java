package com.pratikkroy.design_patterns.structural.adapter_pattern;

import com.pratikkroy.design_patterns.structural.adapter_pattern.adapter.SquareShapeAdapter;
import com.pratikkroy.design_patterns.structural.adapter_pattern.client.existing_use.ExistingUse;
import com.pratikkroy.design_patterns.structural.adapter_pattern.client.existing_use.RoundHole;
import com.pratikkroy.design_patterns.structural.adapter_pattern.client.product.RoundShape;
import com.pratikkroy.design_patterns.structural.adapter_pattern.service.SquarePeg;
import com.pratikkroy.design_patterns.structural.adapter_pattern.service.SquareShape;

/**
 * This pattern is used when the ExporterClient wants to use some
 * third party service but unable to do so because the ExporterClient
 * is using some different interface than the service.
 * So we introduce adapter which will convert all the
 * third party service calls to matching interface.
 *
 * ExporterClient is using RoundShape interface. Now ExporterClient wants to use third party interface SquareShape.
 * ExporterClient is checking if given RoundShape will be fit in RoundHole or not.
 * Now ExporterClient wants to check if given SquareShape will fit into the RoundHole or not.
 * So adapter code is written to convert the square sides to corresponding radius to be fitted.
 *
 * RoundHole.fitsIn only accepts RoundShape so adapter code is written such that it converts the
 * SquareShape into RoundShape by implementing RoundShape interface and accepting SquareShape in constructor.
 * Also in the getRadius() method converting the side of square shape into appropriate radius.
 */
public class AdapterPatternDemo {
    public static void demo(){
        System.out.println();
        System.out.println("Adapter pattern demo.....");

        // Existing use
        System.out.println();
        System.out.println("Existing use demo.....");
        ExistingUse existingUse = new ExistingUse();
        existingUse.demo();

        System.out.println();
        System.out.println("Adapter use demo.....");

        RoundHole roundHole = new RoundHole(10);
        SquareShape squareShape = new SquarePeg(10);

        SquareShapeAdapter adapter = new SquareShapeAdapter(squareShape);
        System.out.println(String.format(
                "squareShape with side=%.2f %s in roundHole with radius=%.2f",
                squareShape.getSide(), ExistingUse.fitsIn(roundHole, adapter), roundHole.getRadius()
        ));
    }
}

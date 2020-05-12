package com.pratikkroy.design_patterns.structural.adapter_pattern.client.existing_use;

import com.pratikkroy.design_patterns.structural.adapter_pattern.client.product.RoundShape;
import com.pratikkroy.design_patterns.structural.adapter_pattern.client.product.impl.RoundPeg;

/**
 * This class gives existing_use how existing component RoundShape and RoundPeg is used.
 */
public class ExistingUse {
    public void demo(){
        RoundHole roundHole = new RoundHole(10);
        RoundShape[] roundShapes = {new RoundPeg(5), new RoundPeg(10), new RoundPeg(15)};

        for(RoundShape roundShape: roundShapes){
            System.out.println(String.format(
                    "roundShape with radius=%.2f %s in roundHole with radius=%.2f",
                    roundShape.getRadius(), fitsIn(roundHole, roundShape), roundHole.getRadius()
            ));
        }
    }

    // util method to convert boolean to proper string
    public static String fitsIn(RoundHole roundHole, RoundShape roundShape){
        return roundHole.fitsIn(roundShape) ? "fits in":"does not fit in";
    }
}

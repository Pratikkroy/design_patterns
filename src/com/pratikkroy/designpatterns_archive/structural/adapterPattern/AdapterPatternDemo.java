package com.pratikkroy.designpatterns.structural.adapterPattern;

import com.pratikkroy.designpatterns.creational.factoryPattern.Item;
import com.pratikkroy.designpatterns.structural.adapterPattern.adapter.SquarePegAdapter;
import com.pratikkroy.designpatterns.structural.adapterPattern.incompatibleProduct.SquarePeg;
import com.pratikkroy.designpatterns.structural.adapterPattern.library.RoundHole;
import com.pratikkroy.designpatterns.structural.adapterPattern.library.RoundPeg;

public class AdapterPatternDemo {

    public static void start() {

        final RoundHole roundHole = new RoundHole(10);
        final RoundPeg roundPeg = new RoundPeg(8);
        System.out.println("Is round peg with radius="+roundPeg.getRadius()
                +" fits in round hole of radius="+roundHole.getRadius()+ " : "+ roundHole.fitsIn(roundPeg));

        final SquarePeg squarePeg = new SquarePeg(5);
        final SquarePegAdapter adapter = new SquarePegAdapter(squarePeg);
        System.out.println("Is square peg with length="+squarePeg.getLength()
                +" fits in round hole of radius="+roundHole.getRadius()+ " : "+ roundHole.fitsIn(adapter));
    }
}

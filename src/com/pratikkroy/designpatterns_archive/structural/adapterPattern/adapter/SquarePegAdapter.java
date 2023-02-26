package com.pratikkroy.designpatterns.structural.adapterPattern.adapter;

import com.pratikkroy.designpatterns.structural.adapterPattern.incompatibleProduct.SquarePeg;
import com.pratikkroy.designpatterns.structural.adapterPattern.library.RoundPeg;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg squarePeg;

    public SquarePegAdapter(final SquarePeg squarePeg) {
        super(10); // some dummy value for sake of initialisation
        this.squarePeg = squarePeg;
        super.setRadius(this.getRadius());
    }

    @Override
    public double getRadius() {
        return this.squarePeg.getLength()/Math.sqrt(2);
    }
}

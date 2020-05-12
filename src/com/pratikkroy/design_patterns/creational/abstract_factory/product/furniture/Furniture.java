package com.pratikkroy.design_patterns.creational.abstract_factory.product.furniture;

import com.pratikkroy.design_patterns.creational.abstract_factory.product.chair.Chair;
import com.pratikkroy.design_patterns.creational.abstract_factory.product.sofa.Sofa;
import com.pratikkroy.design_patterns.creational.abstract_factory.product.table.Table;

public class Furniture {
    private Chair chair;
    private Table table;
    private Sofa  sofa;

    public Furniture(final Chair chair, final Table table, final Sofa sofa) {
        this.chair = chair;
        this.table = table;
        this.sofa = sofa;
    }

    public Chair getChair() {
        return chair;
    }

    public void setChair(final Chair chair) {
        this.chair = chair;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(final Table table) {
        this.table = table;
    }

    public Sofa getSofa() {
        return sofa;
    }

    public void setSofa(final Sofa sofa) {
        this.sofa = sofa;
    }

    @Override
    public String toString() {
        return "Furniture{" + "chair=" + chair + ", table=" + table + ", sofa=" + sofa + '}';
    }
}

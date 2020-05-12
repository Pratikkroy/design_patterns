package com.pratikkroy.design_patterns.structural.decorater_pattern.decorater;

import com.pratikkroy.design_patterns.structural.decorater_pattern.component.DataSource;

public abstract class DataSourceBaseDecorator implements DataSource {

    protected DataSource wrapee;

    public DataSourceBaseDecorator(DataSource source){
        this.wrapee = source;
    }

    @Override
    public void writeData(final String data) {
        wrapee.writeData(data);
    }

    @Override
    public String readData() {
        return wrapee.readData();
    }
}

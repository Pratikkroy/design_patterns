package com.pratikkroy.designpatterns.structural.decoraterPattern.decorator;

import com.pratikkroy.designpatterns.structural.decoraterPattern.library.DataSource;

public class DataSourceDecorator implements DataSource {

    private DataSource dataSource;

    public DataSourceDecorator(final DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void writeData(final String data) {
        dataSource.writeData(data);
    }

    @Override
    public String readData() {
        return dataSource.readData();
    }
}

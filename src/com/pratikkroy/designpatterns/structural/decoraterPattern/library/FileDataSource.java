package com.pratikkroy.designpatterns.structural.decoraterPattern.library;

public class FileDataSource implements DataSource {
    private String dataHolder = "";

    @Override
    public void writeData(final String data) {
        this.dataHolder = data;
    }

    @Override
    public String readData() {
        return this.dataHolder;
    }
}

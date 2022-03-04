package com.pratikkroy.designpatterns.structural.decoraterPattern.decorator;

import com.pratikkroy.designpatterns.structural.decoraterPattern.library.DataSource;

public class EncryptionDecorator extends DataSourceDecorator {
    private static final int key = 5;

    public EncryptionDecorator(final DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(final String data) {
        super.writeData(encode(data));
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }

    private String encode(final String data) {
        StringBuilder encryptedData = new StringBuilder("");
        for (int i=0; i<data.length(); i++) {
            encryptedData.append(Character.valueOf((char) (data.charAt(i) + key)));
        }
        return encryptedData.toString();
    }

    private String decode(final String data) {
        StringBuilder decryptedData = new StringBuilder("");
        for (int i=0; i<data.length(); i++) {
            decryptedData.append(Character.valueOf((char) (data.charAt(i) - key)));
        }
        return decryptedData.toString();
    }
}

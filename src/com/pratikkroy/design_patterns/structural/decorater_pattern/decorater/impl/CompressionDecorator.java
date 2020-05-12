package com.pratikkroy.design_patterns.structural.decorater_pattern.decorater.impl;

import com.pratikkroy.design_patterns.structural.decorater_pattern.component.DataSource;
import com.pratikkroy.design_patterns.structural.decorater_pattern.decorater.DataSourceBaseDecorator;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class CompressionDecorator extends DataSourceBaseDecorator {

    private static final int COMPRESSION_LEVEL = 6;

    public CompressionDecorator(final DataSource source) {
        super(source);
    }

    @Override
    public void writeData(final String data) {
        System.out.println("Compressing data...");
        String compressedData = compress(data);
        super.writeData(compressedData);
    }

    @Override
    public String readData() {
        String compressedData = super.readData();
        System.out.println("Decompressing data...");
        return decompress(compressedData);
    }

    private String compress(String stringData) {
        byte[] data = stringData.getBytes();
        try {
            ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
            DeflaterOutputStream dos = new DeflaterOutputStream(bout, new Deflater(COMPRESSION_LEVEL));
            dos.write(data);
            dos.close();
            bout.close();
            return Base64.getEncoder().encodeToString(bout.toByteArray());
        } catch (IOException ex) {
            return null;
        }
    }

    private String decompress(String stringData) {
        byte[] data = Base64.getDecoder().decode(stringData);
        try {
            InputStream in = new ByteArrayInputStream(data);
            InflaterInputStream iin = new InflaterInputStream(in);
            ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
            int b;
            while ((b = iin.read()) != -1) {
                bout.write(b);
            }
            in.close();
            iin.close();
            bout.close();
            return new String(bout.toByteArray());
        } catch (IOException ex) {
            return null;
        }
    }
}

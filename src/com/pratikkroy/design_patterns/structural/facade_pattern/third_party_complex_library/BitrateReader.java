package com.pratikkroy.design_patterns.structural.facade_pattern.third_party_complex_library;

import com.pratikkroy.design_patterns.structural.facade_pattern.third_party_complex_library.codec.Codec;

public class BitrateReader {
    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("BitrateReader: reading file...");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("BitrateReader: writing file...");
        return buffer;
    }
}

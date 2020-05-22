package com.pratikkroy.design_patterns.structural.facade_pattern.facade;

import com.pratikkroy.design_patterns.structural.facade_pattern.third_party_complex_library.AudioMixer;
import com.pratikkroy.design_patterns.structural.facade_pattern.third_party_complex_library.BitrateReader;
import com.pratikkroy.design_patterns.structural.facade_pattern.third_party_complex_library.VideoFile;
import com.pratikkroy.design_patterns.structural.facade_pattern.third_party_complex_library.codec.Codec;
import com.pratikkroy.design_patterns.structural.facade_pattern.third_party_complex_library.codec.factory.CodecFactory;
import com.pratikkroy.design_patterns.structural.facade_pattern.third_party_complex_library.codec.impl.MPEG4CompressionCodec;
import com.pratikkroy.design_patterns.structural.facade_pattern.third_party_complex_library.codec.impl.OggCompressionCodec;

import java.io.File;

/**
 * We can also have a AudioConversionFacade
 * to convert audio. Not implementing right now
 * because then we have to change BitrateReader, codec code to add AudioFile.
 */
public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {

        System.out.println("First creatimg the Video file to be converted");
        VideoFile file = new VideoFile(fileName);

        System.out.println("VideoConversionFacade: conversion started.");
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new OggCompressionCodec();
        } else {
            destinationCodec = new MPEG4CompressionCodec();
        }
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
}

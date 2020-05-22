package com.pratikkroy.design_patterns.structural.facade_pattern.third_party_complex_library.codec.factory;

import com.pratikkroy.design_patterns.structural.facade_pattern.third_party_complex_library.VideoFile;
import com.pratikkroy.design_patterns.structural.facade_pattern.third_party_complex_library.codec.Codec;
import com.pratikkroy.design_patterns.structural.facade_pattern.third_party_complex_library.codec.impl.MPEG4CompressionCodec;
import com.pratikkroy.design_patterns.structural.facade_pattern.third_party_complex_library.codec.impl.OggCompressionCodec;

public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        }
        else {
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OggCompressionCodec();
        }
    }
}

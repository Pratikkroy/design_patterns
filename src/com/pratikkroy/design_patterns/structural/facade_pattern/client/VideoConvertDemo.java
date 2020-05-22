package com.pratikkroy.design_patterns.structural.facade_pattern.client;

import com.pratikkroy.design_patterns.structural.facade_pattern.facade.VideoConversionFacade;

import java.io.File;

public class VideoConvertDemo {
    public static void demo() {
        System.out.println();
        System.out.println("Video converting demo");

        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}

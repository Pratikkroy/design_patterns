package com.pratikkroy.design_patterns.structural.proxy_pattern.service.third_party_youtube_library;

import com.pratikkroy.design_patterns.structural.proxy_pattern.service.product.Video;

import java.util.HashMap;

public interface ThirdPartyYoutubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}

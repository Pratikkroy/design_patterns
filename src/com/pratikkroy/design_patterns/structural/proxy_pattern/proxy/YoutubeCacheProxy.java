package com.pratikkroy.design_patterns.structural.proxy_pattern.proxy;

import com.pratikkroy.design_patterns.structural.proxy_pattern.service.product.Video;
import com.pratikkroy.design_patterns.structural.proxy_pattern.service.third_party_youtube_library.ThirdPartyYoutubeLib;
import com.pratikkroy.design_patterns.structural.proxy_pattern.service.third_party_youtube_library.impl.ThirdPartyYoutubeLibConcreteClass;

import java.util.HashMap;

/**
 * This class keeps cache of downloaded videos.
 * if found then return from cache else call service method.
 *
 * We can add code to invalidate and empty cache after a certain time
 * but that is not relevant here.
 */
public class YoutubeCacheProxy implements ThirdPartyYoutubeLib {

    private ThirdPartyYoutubeLib   youtubeService;
    private HashMap<String, Video> cachePopular = new HashMap<String, Video>();
    private HashMap<String, Video> cacheAll     = new HashMap<String, Video>();

    public YoutubeCacheProxy() {
        this.youtubeService = new ThirdPartyYoutubeLibConcreteClass();
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular = youtubeService.popularVideos();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
        return video;
    }

    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}

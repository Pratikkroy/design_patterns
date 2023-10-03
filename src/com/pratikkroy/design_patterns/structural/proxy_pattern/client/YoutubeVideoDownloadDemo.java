package com.pratikkroy.design_patterns.structural.proxy_pattern.client;

import com.pratikkroy.design_patterns.structural.proxy_pattern.proxy.YoutubeCacheProxy;
import com.pratikkroy.design_patterns.structural.proxy_pattern.service.third_party_youtube_library.impl.ThirdPartyYoutubeLibConcreteClass;

/**
 * This demonstrates two codes, one with cache and another without cache.
 * Generally ExporterClient should not use code without cache and always should use proxy.
 * Or in a better scenario The service itself should add proxy at its side.
 */
public class YoutubeVideoDownloadDemo {

    public static void demo() {
        YoutubeDownloader naiveDownloader = new YoutubeDownloader(new ThirdPartyYoutubeLibConcreteClass());
        YoutubeDownloader smartDownloader = new YoutubeDownloader(new YoutubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");

    }

    private static long test(YoutubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // UsersDatabase might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}

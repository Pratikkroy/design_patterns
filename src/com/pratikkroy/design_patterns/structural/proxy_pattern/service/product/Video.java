package com.pratikkroy.design_patterns.structural.proxy_pattern.service.product;

public class Video {
    public String id;
    public String title;
    public String data;

    public Video(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = "Random video.";
    }
}

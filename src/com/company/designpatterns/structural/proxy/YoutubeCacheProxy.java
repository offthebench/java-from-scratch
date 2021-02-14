package com.company.designpatterns.structural.proxy;

import java.util.HashMap;

public class YoutubeCacheProxy implements ThirdPartyVideoLib {
    private YoutubeLibrary youtubeLibrary;
    private HashMap<String, Video> cachePopular = new HashMap<>();
    private HashMap<String, Video> cacheAll = new HashMap<>();

    public YoutubeCacheProxy() {
        this.youtubeLibrary = new YoutubeLibrary();
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular = youtubeLibrary.popularVideos();
        } else {
            System.out.println("Retrieved list from cache");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = youtubeLibrary.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("retrieved video " + videoId);
        }
        return video;
    }

    public void reset()  {
        cachePopular.clear();
        cacheAll.clear();
    }
}

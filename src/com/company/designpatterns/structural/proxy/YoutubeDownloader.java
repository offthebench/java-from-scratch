package com.company.designpatterns.structural.proxy;

import java.util.HashMap;

public class YoutubeDownloader {

    private ThirdPartyVideoLib youtubeLibrary;

    public YoutubeDownloader(ThirdPartyVideoLib youtubeLibrary) {
        this.youtubeLibrary = youtubeLibrary;
    }

    public void renderVideoPage(String videoId) {
        Video video = youtubeLibrary.getVideo(videoId);
        System.out.println("Video Page");
        System.out.println("ID" + video.getId());
        System.out.println("Name" + video.getTitle());
    }

    public void renderPopularVideos() {
        HashMap<String, Video> hashMap = youtubeLibrary.popularVideos();

        for (Video video : hashMap.values()) {
            System.out.println("Video Page");
            System.out.println("ID" + video.getId());
            System.out.println("Name" + video.getTitle());
        }
    }
}

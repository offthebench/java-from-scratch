package com.company.designpatterns.structural.proxy;

import java.util.HashMap;

public class YoutubeLibrary implements ThirdPartyVideoLib {
    @Override
    public HashMap<String, Video> popularVideos() {
        System.out.println("Connecting to Youtube");
        return getRandomVideos();
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = new Video(videoId, "Some Video");

        return video;
    }

    private HashMap<String, Video> getRandomVideos() {

        HashMap<String, Video> hashMap = new HashMap<>();
        hashMap.put("JavaFromScratch1", new Video("1", "JavaFromScratch1.avi"));
        hashMap.put("JavaFromScratch2", new Video("2", "JavaFromScratch2.avi"));
        hashMap.put("JavaFromScratch3", new Video("3", "JavaFromScratch3.avi"));
        hashMap.put("JavaFromScratch4", new Video("4", "JavaFromScratch4.avi"));
        hashMap.put("JavaFromScratch5", new Video("5", "JavaFromScratch5.avi"));
        hashMap.put("JavaFromScratch6", new Video("6", "JavaFromScratch6.avi"));

        return hashMap;
    }
}

package com.company.designpatterns.structural.proxy;

public class Client {

    public static void main(String[] args) {

        YoutubeDownloader simpleDownloader = new YoutubeDownloader(new YoutubeLibrary());
        YoutubeDownloader advancedDownloader = new YoutubeDownloader(new YoutubeCacheProxy());

        long time1 = test(simpleDownloader);
        long time2 = test(advancedDownloader);

        System.out.println("Time saved by using cache proxy: " + (time1 - time2) + "ms");

    }

    private static long test(YoutubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        downloader.renderPopularVideos();
        downloader.renderVideoPage("Type 1");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("Type 2");
        downloader.renderVideoPage("Type 2");
        downloader.renderVideoPage("Type 2");
        downloader.renderPopularVideos();

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}

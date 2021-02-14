package com.company.designpatterns.structural.facade;

import java.io.File;

public class Client {

    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4 = converter.convert("JavaFromScratchVideo.avi", "mp4");
    }
}

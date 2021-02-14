package com.company.designpatterns.structural.facade;

import java.io.File;

public class AudioMixer {

    public File fix(VideoFile result) {
        System.out.println("Fixing Audio");
        return new File("tmp");
    }
}

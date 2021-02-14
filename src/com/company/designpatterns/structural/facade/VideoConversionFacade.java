package com.company.designpatterns.structural.facade;

import java.io.File;

public class VideoConversionFacade {

    public File convert(String filename, String format) {
        System.out.println("Conversion started...");
        VideoFile file = new VideoFile(filename);
        Codec sourceCode = CodecFactory.extract(file);

        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new AVICompressionCodec();
        } else {
            destinationCodec = new MPEG4CompressionCodec();
        }

        VideoFile buffer = BitrateReader.read(file, sourceCode);
        VideoFile nextResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(nextResult);

        System.out.println("Conversion completed.");

        return result;
    }
}

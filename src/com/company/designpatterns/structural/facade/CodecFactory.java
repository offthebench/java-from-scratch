package com.company.designpatterns.structural.facade;

public class CodecFactory {

    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("Extracting mpeg4 video");
            return new MPEG4CompressionCodec();
        } else {
            System.out.println("Extracting mpeg4 video");
            return new AVICompressionCodec();
        }
    }
}

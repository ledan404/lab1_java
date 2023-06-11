package ua.lviv.iot.algo.part1.lab2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Writer {
    public void writeToFile(List<Video> videos, String fileName) throws IOException {

        File file = new File(fileName);
        try (PrintWriter pw = new PrintWriter(file)) {
            Video videoType = videos.get(0);
            pw.println(videos.get(0).getHeaders());
            for (var video : videos) {
                if (videoType.getClass() != video.getClass()) {
                    videoType = video;
                    pw.println(video.getHeaders());
                }
                pw.println(video.toCSV());
            }
        }
    }
}
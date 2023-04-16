package ua.lviv.iot.algo.part1.lab2;

import lombok.ToString;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

@ToString
public class VideoManager {
    private static final LinkedList<Video> videos = new LinkedList<>();

    public static void addVideo(final Video temp) {
        videos.add(temp);
    }


    public static void main(String[] args) throws IOException {
        Clip clip = new Clip("Never Gonna Give Ypu Up", "David Hrincker", 1999, "Rick ALstay", 2400404, 130000000);
        Clip clip2 = new Clip("See you Again", "Yana Lombok", 2015, "Wiz Khalifa", 23232232, 232032030);
        Film film = new Film("Silicon Valley", "Duk Colin", 2013, 9);
        Film film2 = new Film("Braking Bad", "Walter Black", 2009, 11);
        addVideo(clip);
        addVideo(clip2);
        addVideo(film);
        addVideo(film2);
        Writer writer = new Writer();
        writer.writeToFile(videos,"videos.csv" );

        for (var object : videos) {
            System.out.println(object);
        }
    }

}

package ua.lviv.iot.algo.part1.lab2;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)

public class Clip extends Video {
    private String artist;

    private int like;

    private int views;

    public Clip(String title, String director, Integer year, String artist, int like, int views) {
        super(title, director, year);
        this.views = views;
        this.artist = artist;
        this.like = like;
    }

    public double getCurrentRating() {
        return like / views;
    }
    @Override
    public String getHeaders() {
        return super.getHeaders() + ", views, artist, like";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + views + "," + artist + "," + like;
    }
}

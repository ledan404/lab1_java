package ua.lviv.iot.algo.part1.lab2;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)

public class Clip extends Video {
    private String artist;

    private int like;

    private int viems;

    public Clip(String title, String director, Integer year, String artist, int like, int viems) {
        super(title, director, year);
        this.viems = viems;
        this.artist = artist;
        this.like = like;
    }

    public double getCurrentRating() {
        return like / viems;
    }
}

package ua.lviv.iot.algo.part1.lab2;

import lombok.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
abstract class Video {
    private String title;
    private String director;

    private Integer year;

    public double getCurrentRating(double rating) {
        return rating;
    }
}

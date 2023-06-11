package ua.lviv.iot.algo.part1.lab2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class Film extends Video {
    public static Film instance;
    private int marks;

    public Film(String title, String director, Integer year, int marks) {
        super(title, director, year);
        this.marks = marks;
    }

    public static Film getInstance() {
        if (instance == null) {
            return new Film();
        }
        return instance;
    }

    public void rate(int rating) {
        if (rating < 1) {
            rating = 1;
        } else if (rating > 10) {
            rating = 10;
        }
        marks++;
    }

    public double getCurrentRating(double rating) {
        return (double) rating / marks;
    }
    @Override
    public String getHeaders() {
        return super.getHeaders() + ", marks";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + marks;
    }
}

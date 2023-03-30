package ua.lviv.iot.algo.part1.lab1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Film {
    private String title;
    private String director;
    private int year;
    private double rating;
    private int marks;
    public static Film instance;

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
        this.rating += rating;
        marks++;
    }

    public double getCurrentRating(double rating) {
        return (double) rating / marks;
    }

    public static void main(String[] Args) {
        Film[] films = new Film[4];
        films[0] = new Film();
        films[1] = new Film("Fight Club", "David Fincher", 1999, 8.8, 2155592);
        films[2] = Film.getInstance();
        films[3] = Film.getInstance();
        for (Film counter : films ) {
            System.out.println(counter);
        }
    }
}

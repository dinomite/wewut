package wewut.refactored;

import wewut.Movie;
import wewut.Rental;

public class RentalBuilder {
    final Movie movie;
    final int days;

    RentalBuilder() {
        this(new MovieBuilder().build(), 3);
    }

    RentalBuilder(Movie movie, int days) {
        this.movie = movie;
        this.days = days;
    }

    public RentalBuilder w(
            MovieBuilder movie) {
        return
                new RentalBuilder(
                        movie.build(), days);
    }

    public Rental build() {
        return new Rental(movie, days);
    }
}

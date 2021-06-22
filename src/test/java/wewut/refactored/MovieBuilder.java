package wewut.refactored;

import wewut.Movie;

public class MovieBuilder {
    final String name;
    final Movie.Type type;

    MovieBuilder() {
        this("Godfather 4",
                Movie.Type.NEW_RELEASE);
    }

    MovieBuilder(
            String name, Movie.Type type) {
        this.name = name;
        this.type = type;
    }

    public MovieBuilder w(Movie.Type type) {
        return new MovieBuilder(name, type);
    }

    public MovieBuilder w(String name) {
        return new MovieBuilder(name, type);
    }

    public Movie build() {
        return new Movie(name, type);
    }
}

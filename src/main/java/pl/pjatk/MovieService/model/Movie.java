package pl.pjatk.MovieService.model;

public class Movie {

    private long movieId;
    private String name;

    public Movie(long movieId, String name) {
        this.movieId = movieId;
        this.name = name;
    }

    public long getMovieId() {
        return movieId;
    }

    public void setMovieId(long movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

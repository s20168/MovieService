package pl.pjatk.MovieService.model;

public class Movie {

    private Long id;
    private String name;

    public Movie(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getMovieId() {
        return id;
    }

    public void setMovieId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public enum Genre {
        Thriller,
        Action,
        Comedy,
        Horror,
        Drama,
        ScienceFiction,
    }

    protected Genre genre;

    public Movie(Genre g) {
        this.genre = g;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}

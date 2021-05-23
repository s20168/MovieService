package pl.pjatk.MovieService.model;

public class Movie {

    private Long id;
    private String title;
    private Genre genre;

    public Movie(long id, String title, Genre genre) {
        this.id = id;
        this.title = title;
        this.genre = genre;
    }

    public Movie() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}

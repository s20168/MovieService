package pl.pjatk.MovieService.service;

import org.springframework.stereotype.Service;
import pl.pjatk.MovieService.model.Genre;
import pl.pjatk.MovieService.model.Movie;

import java.util.List;

@Service
public class MovieService {

    public List<Movie> getMovie() {
        return List.of(new Movie(1, "Action Movie", Genre.Action));
    }

    public Movie findId(Long id) {
        return new Movie(1, "Horror Movie", Genre.Horror);
    }

    public Movie addMovie (Movie movie) {
        return movie;
    }

    public Movie updateMovie (Movie movie, Long id) {
        return new Movie(id, movie.getName(), movie.getGenre());
    }

    public Long deleteMovie (Long id) {
        return id;
    }

}

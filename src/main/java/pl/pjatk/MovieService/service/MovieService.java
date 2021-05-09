package pl.pjatk.MovieService.service;

import pl.pjatk.MovieService.model.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> getMovie();
    Movie getMovie(long movieId);
}

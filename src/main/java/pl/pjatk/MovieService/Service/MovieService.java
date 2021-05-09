package pl.pjatk.MovieService.Service;

import pl.pjatk.MovieService.Model.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> getMovie();
    Movie getMovie(long id);
}

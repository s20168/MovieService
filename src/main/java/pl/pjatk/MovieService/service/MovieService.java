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

}

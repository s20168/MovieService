package pl.pjatk.MovieService.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.pjatk.MovieService.model.Movie;

import java.util.List;

@Controller
@RequestMapping("/movie")
public class MovieController {

    @GetMapping("/Movies")
    public ResponseEntity<List<Movie>> getAll() {
        return new ResponseEntity<List<Movie>>(HttpStatus.OK);
    }

    @GetMapping("/Movies/{id}")
    public Movie getMovieInfo(@PathVariable("movieId")long movieId) {
        return new Movie(movieId, "Test name");
    }


}
package com.example.demo.controllers;

import com.example.demo.models.Movie;
import com.example.demo.models.MovieGenre;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private Map<Long, Movie> movieMap = new HashMap<>();
    private final AtomicLong idCounter = new AtomicLong();

    public MovieController() {



        Movie m1 = new Movie("Harry Potter", 2005, true, MovieGenre.FANTASY);
        m1.setId(idCounter.incrementAndGet());
        movieMap.put(m1.getId(), m1);

        Movie m2 = new Movie("Lord of the Rings", 2001, true, MovieGenre.ADVENTURE);
        m2.setId(idCounter.incrementAndGet());
        movieMap.put(m2.getId(), m2);

        Movie m3 = new Movie("Spider Man", 2021, true, MovieGenre.ACTION);
        m3.setId(idCounter.incrementAndGet());
        movieMap.put(m3.getId(), m3);

        Movie m4 = new Movie("Mission Impossible", 2024, false, MovieGenre.ACTION);
        m4.setId(idCounter.incrementAndGet());
        movieMap.put(m4.getId(), m4);

        Movie m5 = new Movie("Conjuring", 2019, false, MovieGenre.THRILLER);
        m5.setId(idCounter.incrementAndGet());
        movieMap.put(m5.getId(), m5);

    }
    @GetMapping
    public ResponseEntity<Map<Long, Movie>> getMovies() {
//        return movies;
        return ResponseEntity.ok(movieMap);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable("id") Long id) {
        // Fetch the movie from the map by ID
        Movie movie = movieMap.get(id);


        // If movie is found, return 200 OK with the movie
        if(movie != null){
            return ResponseEntity.ok(movie);
        }

        return ResponseEntity.notFound().build();
    }

    //create new movie
    @PostMapping
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
        movie.setId(idCounter.incrementAndGet());
        movieMap.put(movie.getId(), movie);

        return ResponseEntity.status(HttpStatus.CREATED).body(movie);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable("id") Long id) {
        Movie movie = movieMap.remove(id);  // Remove the movie by its ID

        return null;
    }

    @GetMapping("/rent/{id}")
    public ResponseEntity<Movie> rentMovieById(@PathVariable Long id) {
        // Retrieve the movie by its ID
        Movie movie = movieMap.get(id);  // Access the movieMap using the movie ID

        // Check if the movie exists and is available
        if (movie != null && movie.isAvailable()) {
            movie.setAvailable(false);  // Mark the movie as rented (unavailable)
            return ResponseEntity.ok(movie);  // Return the updated movie
        }

        // If the movie doesn't exist or is not available, return a 404 Not Found
        return ResponseEntity.notFound().build();
    }


}

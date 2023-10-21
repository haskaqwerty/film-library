package io.github.haskaqwerty.filmlibrary.controller;

import io.github.haskaqwerty.filmlibrary.pojo.Movie;
import io.github.haskaqwerty.filmlibrary.service.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {
        private final MovieServiceImpl movieService;

        @Autowired
        public MovieController(MovieServiceImpl movieService) {
            this.movieService = movieService;
        }

        @PostMapping(value = "/movies")
        public ResponseEntity<?> create(@RequestBody Movie movie){
            movieService.create(movie);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }

        @GetMapping(value = "/movies")
        public ResponseEntity<List<Movie>> read(){
            final List<Movie> movies = movieService.readAll();
            return movies != null && !movies.isEmpty()
                    ? new ResponseEntity<>(movies, HttpStatus.OK)
                    : new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        @PutMapping(value = "/movies/{id}")
        public ResponseEntity<?> update(@PathVariable(name = "id") int id, @RequestBody Movie movie){
            final boolean updated = movieService.update(movie,id);
            return updated
//        final User usr = userService.update(user,id);
//        return usr != null
                    ? new ResponseEntity<>(HttpStatus.OK)
                    : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
        }

        @DeleteMapping(value = "/movies/{id}")
        public ResponseEntity<?> delete (@PathVariable(name = "id") int id){
            final boolean deleted = movieService.delete(id);
            return deleted
                    ? new ResponseEntity<>(HttpStatus.OK)
                    : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
        }
    }



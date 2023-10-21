package io.github.haskaqwerty.filmlibrary.service;

import io.github.haskaqwerty.filmlibrary.dao.MovieDaoImpl;
import io.github.haskaqwerty.filmlibrary.pojo.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{
    MovieDaoImpl movieRepository = new MovieDaoImpl();
    @Override
    public boolean create(Movie movie) {
        boolean result = movieRepository.create(movie);
        return result;
    }

    @Override
    public List<Movie> readAll() {
        List<Movie> movieList = new ArrayList<>();
        movieList = movieRepository.getAll();
        System.out.println(movieList.toString());
        return movieList;
    }

    @Override
    public Movie read(int id) {
        Movie movie = new Movie();
        movie=movieRepository.getMovieById(id);
        System.out.println(movie.toString());
        return movie;
    }

    @Override
    public boolean update(Movie movie, int id) {
        boolean result = movieRepository.update(movie, id);
        return result;
    }

    @Override
    public boolean delete(int id) {
        boolean result = movieRepository.delete(id);
        return result;
    }
}

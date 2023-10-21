package io.github.haskaqwerty.filmlibrary.service;

import io.github.haskaqwerty.filmlibrary.dao.MovieDaoImpl;
import io.github.haskaqwerty.filmlibrary.pojo.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{
    MovieDaoImpl movieRepository = new MovieDaoImpl();
    @Override
    public void create(Movie movie) {

    }

    @Override
    public List<Movie> readAll() {
        return null;
    }

    @Override
    public Movie read(int id) {
        Movie movie = new Movie();
        movie=movieRepository.getMovieById(id);
        movie.toString();
        return movie;
    }

    @Override
    public boolean update(Movie movie, int id) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}

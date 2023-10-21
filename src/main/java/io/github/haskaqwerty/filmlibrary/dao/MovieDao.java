package io.github.haskaqwerty.filmlibrary.dao;

import io.github.haskaqwerty.filmlibrary.pojo.Movie;

import java.util.List;

public interface MovieDao {
    //Optional<Movie>
     Movie getMovieById(int id);

    List<Movie> getAll();
    boolean create(Movie movie);
    //INSERT INTO ? (ProductName, Price, Manufacturer)
    //VALUES ('iPhone X', 71000, 'Apple');
    boolean update(Movie movie,int id);
    //UPDATE Products
    //SET Manufacturer = 'Samsung Inc.'
    //WHERE Manufacturer = 'Samsung';
    boolean delete(int id);

    //DELETE FROM Products
    //WHERE Manufacturer='Apple';

}

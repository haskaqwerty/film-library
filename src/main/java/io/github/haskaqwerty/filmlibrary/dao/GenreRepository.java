package io.github.haskaqwerty.filmlibrary.dao;

import io.github.haskaqwerty.filmlibrary.pojo.Genre;

import java.util.List;
import java.util.Optional;

public interface GenreRepository {
    Optional<Genre> getGenreById(int id);
    List<Genre> getAll();
    void create(Genre genre);
    boolean update(Genre genre,int id);
    boolean delete(int id);

}

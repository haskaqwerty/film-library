package io.github.haskaqwerty.filmlibrary.dao;

import io.github.haskaqwerty.filmlibrary.pojo.Director;

import java.util.List;
import java.util.Optional;

public interface DirectorDao {
    Optional<Director> getDirectorById(int id);
    List<Director> getAll();
    void create(Director director);
    boolean update(Director director,int id);
    boolean delete(int id);

}

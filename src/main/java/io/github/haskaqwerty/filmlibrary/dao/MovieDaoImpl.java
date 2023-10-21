package io.github.haskaqwerty.filmlibrary.dao;

import io.github.haskaqwerty.filmlibrary.pojo.Movie;

import java.sql.*;
import java.util.List;

public class MovieDaoImpl implements MovieDao {
    public static final int ID_INDEX = 1;
    public static final int NAME_INDEX = 2;
    public static final int RELEASED_YEAR_INDEX = 3;
    public static final int DIRECTOR_FIRST_NAME_INDEX = 4;
    public static final int DIRECTOR_LAST_NAME_INDEX = 5;
    public static final int GENRE_INDEX = 6;
    private String url = "jdbc:postgresql://localhost:5432/postgres";
    private String username = "postgresuser";
    private String password = "postgres";
    static String sqlExpression;

    //ArrayList<Movie>list = new ArrayList<Movie>(SimpleRepository.connectDb());
    @Override
    public Movie getMovieById(int movieId) {
        Movie result = null;
        sqlExpression = "select * from movies where id = ? limit 1";
        ResultSet resultSet = null;
        try (Connection connection = DriverManager.getConnection(url, username, password);
             final PreparedStatement preparedStatement = connection.prepareStatement(sqlExpression);
        ) {
            preparedStatement.setInt(ID_INDEX, movieId);
            resultSet = preparedStatement.executeQuery();
            resultSet.next();
            result = Movie.builder()
                    .id(resultSet.getInt(1))
                    .name(resultSet.getString(NAME_INDEX))
                    .releasedYear(resultSet.getInt(RELEASED_YEAR_INDEX))
                    .directorFirstName(resultSet.getString(DIRECTOR_FIRST_NAME_INDEX))
                    .directorLastName(resultSet.getString(DIRECTOR_LAST_NAME_INDEX))
                    .genre(resultSet.getString(GENRE_INDEX))
                    .build();
            resultSet.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
        }

//        try {
//            Class.forName("org.postgresql.Driver");
//            Connection connection = DriverManager.getConnection(url, username, password);
//            PreparedStatement preparedStatement = connection.prepareStatement(sqlExpression);
//            preparedStatement.setInt(1, movieId);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            resultSet.next();
//            result = Movie.builder()
//                    .id(resultSet.getInt(1))
//                    .build();
//            resultSet.close();
//            preparedStatement.close();
//            connection.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
        return result;
    }

    @Override
    public List<Movie> getAll() {
        return null;
    }

    @Override
    public void create(Movie movie) {

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

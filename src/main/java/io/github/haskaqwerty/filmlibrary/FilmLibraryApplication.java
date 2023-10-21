package io.github.haskaqwerty.filmlibrary;

import io.github.haskaqwerty.filmlibrary.service.MovieServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FilmLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmLibraryApplication.class, args);
		MovieServiceImpl movieService = new MovieServiceImpl();
		movieService.read(1);



	}

}

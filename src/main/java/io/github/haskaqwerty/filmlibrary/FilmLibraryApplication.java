package io.github.haskaqwerty.filmlibrary;

import io.github.haskaqwerty.filmlibrary.pojo.Movie;
import io.github.haskaqwerty.filmlibrary.service.MovieServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FilmLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmLibraryApplication.class, args);
		MovieServiceImpl movieService = new MovieServiceImpl();
		Movie example=movieService.read(1);
		//movieService.delete(1);
		movieService.readAll();
		example.setName("Крик часть первая");
		movieService.update(example,1);
		movieService.read(1);
		Movie movieCreated = new Movie(3,"Мгла",2007,"Фрэнк","Дарабонт","Ужасы");
		movieService.create(movieCreated);
		movieService.readAll();






	}

}

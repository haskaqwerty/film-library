package io.github.haskaqwerty.filmlibrary.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Genre {
    private int id;
    private String name;
    public Genre(int id, String name){
        this.name=name;
        this.id=id;
    }

}

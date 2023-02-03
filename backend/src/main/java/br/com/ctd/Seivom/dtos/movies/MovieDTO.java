package br.com.ctd.Seivom.dtos.movies;

import br.com.ctd.Seivom.entities.Movie;

import java.io.Serializable;
import java.time.LocalDate;

public class MovieDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;
    private LocalDate releaseDate;
    private String director;
    private String studio;

    public MovieDTO() {
    }

    public MovieDTO(Long id, String name, LocalDate releaseDate, String director, String studio) {
        this.id = id;
        this.name = name;
        this.releaseDate = releaseDate;
        this.director = director;
        this.studio = studio;
    }

    public MovieDTO(Movie obj) {
        this.id = obj.getId();
        this.name = obj.getName();
        this.releaseDate = obj.getDateRelease();
        this.director = obj.getDirector().getName();
        this.studio = obj.getStudio().getName();
    }
}

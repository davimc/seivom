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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
}

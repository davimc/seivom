package br.com.ctd.Seivom.entities;


import br.com.ctd.Seivom.entities.enums.GenreType;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name="tb_movie")
public class Movie implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate dateRelease;
    private Integer genre;

    @ManyToOne
    @JoinColumn(name = "director_id")
    private Director director;
    @ManyToOne
    @JoinColumn(name = "studio_id")
    private Studio studio;

    public Movie(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Movie(Long id, String name, LocalDate dateRelease, GenreType genre, Director director, Studio studio) {
        this.id = id;
        this.name = name;
        this.dateRelease = dateRelease;
        this.genre = genre.getCod();
        this.director = director;
        this.studio = studio;
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

    public LocalDate getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(LocalDate dateRelease) {
        this.dateRelease = dateRelease;
    }

    public GenreType getGenre() {
        return GenreType.toEnum(genre);
    }

    public void setGenre(GenreType genre) {
        this.genre = genre.getCod();
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie director = (Movie) o;
        return id.equals(director.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

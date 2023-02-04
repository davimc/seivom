package br.com.ctd.Seivom.dtos.director;

import br.com.ctd.Seivom.entities.Director;
import br.com.ctd.Seivom.entities.Director;

import java.io.Serializable;
import java.time.LocalDateTime;

public class DirectorDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;

    public DirectorDTO() {
    }

    public DirectorDTO(Long id, String name) {
        this.id = id;
        this.name = name;
       
    }
    public DirectorDTO(Director obj) {
        this.id = obj.getId();
        this.name = obj.getName();
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

}

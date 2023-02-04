package br.com.ctd.Seivom.dtos.studio;

import br.com.ctd.Seivom.entities.Director;
import br.com.ctd.Seivom.entities.Studio;

import java.io.Serializable;

public class StudioDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;

    public StudioDTO() {
    }

    public StudioDTO(Long id, String name) {
        this.id = id;
        this.name = name;

    }
    public StudioDTO(Studio obj) {
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

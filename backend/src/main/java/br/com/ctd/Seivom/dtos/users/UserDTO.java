package br.com.ctd.Seivom.dtos.users;

import br.com.ctd.Seivom.entities.User;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String email;
    private LocalDateTime dtEntry;

    public UserDTO() {
    }

    public UserDTO(Long id, String name, String email, LocalDateTime dtEntry) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dtEntry = dtEntry;
    }
    public UserDTO(User obj) {
        this.id = obj.getId();
        this.name = obj.getName();
        this.email = obj.getEmail();
        this.dtEntry = obj.getEntry();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getDtEntry() {
        return dtEntry;
    }

    public void setDtEntry(LocalDateTime dtEntry) {
        this.dtEntry = dtEntry;
    }
}

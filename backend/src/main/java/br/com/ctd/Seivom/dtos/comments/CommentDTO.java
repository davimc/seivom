package br.com.ctd.Seivom.dtos.comments;

import br.com.ctd.Seivom.entities.Comment;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalDate;

public class CommentDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String comment;
    private Double rating;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate date;

    private String user;
    private String movie;

    public CommentDTO() {
    }

    public CommentDTO(Long id, String comment, Double rating, LocalDate date, String user, String movie) {
        this.id = id;
        this.comment = comment;
        this.rating = rating;
        this.date = date;
        this.user = user;
        this.movie = movie;
    }

    public CommentDTO(Comment obj) {
        this.id = obj.getId();
        this.comment = obj.getComment();
        this.rating = obj.getRating();
        this.date = obj.getDate();
        this.user = obj.getUser().getName();
        this.movie = obj.getMovie().getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}

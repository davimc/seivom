package br.com.ctd.Seivom.repositories;

import br.com.ctd.Seivom.entities.Comment;
import br.com.ctd.Seivom.entities.Movie;
import br.com.ctd.Seivom.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByMovie(Movie movie);
    List<Comment> findByUser(User user);
}

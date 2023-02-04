package br.com.ctd.Seivom.services;

import br.com.ctd.Seivom.dtos.comments.CommentDTO;
import br.com.ctd.Seivom.entities.Comment;
import br.com.ctd.Seivom.entities.Movie;
import br.com.ctd.Seivom.entities.User;
import br.com.ctd.Seivom.repositories.CommentRepository;
import br.com.ctd.Seivom.services.exceptions.ObjectNotFoundException;
import org.hibernate.cfg.NotYetImplementedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository repository;

    @Autowired
    private MovieService movieService;
    @Autowired
    private UserService userService;

    public Page<CommentDTO> findAll(Pageable pageable) {
        Page<Comment> obj = repository.findAll(pageable);
        return obj.map(CommentDTO::new);
    }

    protected Comment findComment(Long id) {
        return repository.findById(id).orElseThrow(() -> {
            throw new ObjectNotFoundException(id, Comment.class);
        });
    }
    public CommentDTO findDto(Long id) {
        return new CommentDTO(findComment(id));
    }

    public List<CommentDTO> findByMovie(Long idMovie) {
        Movie obj = movieService.findMovie(idMovie);
        return obj.getComments().stream().map(CommentDTO::new).toList();
    }
    public List<CommentDTO> findByUser(Long idUser) {
        User obj = userService.findUser(idUser);
        return obj.getComments().stream().map(CommentDTO::new).toList();
    }

    //TODO post, put, delete
}

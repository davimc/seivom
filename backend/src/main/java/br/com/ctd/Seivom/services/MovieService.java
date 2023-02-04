package br.com.ctd.Seivom.services;

import br.com.ctd.Seivom.dtos.movies.MovieDTO;
import br.com.ctd.Seivom.entities.Movie;
import br.com.ctd.Seivom.repositories.MovieRepository;
import br.com.ctd.Seivom.services.exceptions.ObjectNotFoundException;
import org.hibernate.cfg.NotYetImplementedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    public Page<MovieDTO> findAll(Pageable pageable) {
        Page<Movie> obj = repository.findAll(pageable);
        return obj.map(MovieDTO::new);
    }

    protected Movie findMovie(Long id) {
        return repository.findById(id).orElseThrow(() -> {
            throw new ObjectNotFoundException(id, Movie.class);
        });
    }
    public MovieDTO findDto(Long id) {
        return new MovieDTO(findMovie(id));
    }

    //TODO últimos lançamentos até x quantidade de meses
    public List<MovieDTO> releasesUpTo(int months) {
        throw new NotYetImplementedException("aguardando implementação");
    }

    //TODO post, put, delete
}

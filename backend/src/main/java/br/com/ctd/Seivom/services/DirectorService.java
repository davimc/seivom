package br.com.ctd.Seivom.services;

import br.com.ctd.Seivom.dtos.director.DirectorDTO;
import br.com.ctd.Seivom.entities.Director;
import br.com.ctd.Seivom.repositories.DirectorRepository;
import br.com.ctd.Seivom.services.exceptions.ObjectNotFoundException;
import org.hibernate.cfg.NotYetImplementedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectorService {

    @Autowired
    private DirectorRepository repository;

    public Page<DirectorDTO> findAll(Pageable pageable) {
        Page<Director> obj = repository.findAll(pageable);
        return obj.map(DirectorDTO::new);
    }

    protected Director findDirector(Long id) {
        return repository.findById(id).orElseThrow(() -> {
            throw new ObjectNotFoundException(id, Director.class);
        });
    }
    public DirectorDTO findDto(Long id) {
        return new DirectorDTO(findDirector(id));
    }

    //TODO post, put, delete
}

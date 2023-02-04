package br.com.ctd.Seivom.services;

import br.com.ctd.Seivom.dtos.studio.StudioDTO;
import br.com.ctd.Seivom.entities.Studio;
import br.com.ctd.Seivom.repositories.StudioRepository;
import br.com.ctd.Seivom.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class StudioService {

    @Autowired
    private StudioRepository repository;

    public Page<StudioDTO> findAll(Pageable pageable) {
        Page<Studio> obj = repository.findAll(pageable);
        return obj.map(StudioDTO::new);
    }

    protected Studio findStudio(Long id) {
        return repository.findById(id).orElseThrow(() -> {
            throw new ObjectNotFoundException(id, Studio.class);
        });
    }
    public StudioDTO findDto(Long id) {
        return new StudioDTO(findStudio(id));
    }

    //TODO post, put, delete
}

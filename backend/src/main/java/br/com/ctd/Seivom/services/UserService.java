package br.com.ctd.Seivom.services;

import br.com.ctd.Seivom.dtos.users.UserDTO;
import br.com.ctd.Seivom.entities.User;
import br.com.ctd.Seivom.repositories.UserRepository;
import br.com.ctd.Seivom.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public Page<UserDTO> findAll(Pageable pageable) {
        Page<User> obj = repository.findAll(pageable);

        return obj.map(UserDTO::new);
    }

    protected User findUser(Long id) {
        return repository.findById(id).orElseThrow(() -> {
            throw new ObjectNotFoundException(id, User.class);
        });
    }
    public UserDTO findDto(Long id) {
        return new UserDTO(findUser(id));
    }
    
    //TODO post, put, delete
}

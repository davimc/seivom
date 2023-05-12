package br.com.ctd.Seivom.services;

import br.com.ctd.Seivom.dtos.users.UserDTO;
import br.com.ctd.Seivom.entities.User;
import br.com.ctd.Seivom.repositories.UserRepository;
import br.com.ctd.Seivom.services.exceptions.ObjectNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements UserDetailsService {

    private static Logger logger = LoggerFactory.getLogger(UserService.class);
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


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> obj = repository.findByEmail(username);
        if(obj.isPresent()) {
            logger.info("User found: " + username);
            return obj.get();
        }
        logger.error("Email not found: " + username);
        throw new UsernameNotFoundException("Email not found: " + username);
    }
}

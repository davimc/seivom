package br.com.ctd.Seivom.repositories;

import br.com.ctd.Seivom.entities.Director;
import br.com.ctd.Seivom.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
}

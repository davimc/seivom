package br.com.ctd.Seivom.repositories;

import br.com.ctd.Seivom.entities.Director;
import br.com.ctd.Seivom.entities.Studio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudioRepository extends JpaRepository<Studio, Long> {
}

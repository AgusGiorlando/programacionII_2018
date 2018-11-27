package ar.edu.um.prog2.repository;

import ar.edu.um.prog2.domain.Sala;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Sala entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SalaRepository extends JpaRepository<Sala, Long> {

}

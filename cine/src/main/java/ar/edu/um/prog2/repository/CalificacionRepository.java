package ar.edu.um.prog2.repository;

import ar.edu.um.prog2.domain.Calificacion;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Calificacion entity.
 */
@SuppressWarnings("unused")
@Repository
public interface CalificacionRepository extends JpaRepository<Calificacion, Long> {

}

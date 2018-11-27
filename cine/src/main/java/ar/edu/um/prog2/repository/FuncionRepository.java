package ar.edu.um.prog2.repository;

import ar.edu.um.prog2.domain.Funcion;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Funcion entity.
 */
@SuppressWarnings("unused")
@Repository
public interface FuncionRepository extends JpaRepository<Funcion, Long> {

}

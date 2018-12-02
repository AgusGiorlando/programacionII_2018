package ar.edu.um.prog2.repository;

import ar.edu.um.prog2.domain.Funcion;
import ar.edu.um.prog2.domain.Ocupacion;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Spring Data  repository for the Ocupacion entity.
 */
@SuppressWarnings("unused")
@Repository
public interface OcupacionRepository extends JpaRepository<Ocupacion, Long> {
    List<Ocupacion> findAllByFuncionAndButacaNotNull(Funcion funcion);
}

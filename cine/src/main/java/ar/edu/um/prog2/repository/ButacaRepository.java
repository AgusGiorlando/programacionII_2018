package ar.edu.um.prog2.repository;

import ar.edu.um.prog2.domain.Butaca;
import ar.edu.um.prog2.domain.Sala;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Spring Data  repository for the Butaca entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ButacaRepository extends JpaRepository<Butaca, Long> {
    List<Butaca> findAllBySala(Sala sala);
    List<Butaca> findAllBySalaAndIdNotIn(Sala sala, List<Long> butacas);
}

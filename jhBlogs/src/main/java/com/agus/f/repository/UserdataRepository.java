package com.agus.f.repository;

import com.agus.f.domain.Userdata;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Userdata entity.
 */
@SuppressWarnings("unused")
@Repository
public interface UserdataRepository extends JpaRepository<Userdata, Long> {

}

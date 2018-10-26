package com.agus.f.service;

import com.agus.f.domain.Userdata;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing Userdata.
 */
public interface UserdataService {

    /**
     * Save a userdata.
     *
     * @param userdata the entity to save
     * @return the persisted entity
     */
    Userdata save(Userdata userdata);

    /**
     * Get all the userdata.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    Page<Userdata> findAll(Pageable pageable);


    /**
     * Get the "id" userdata.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<Userdata> findOne(Long id);

    /**
     * Delete the "id" userdata.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}

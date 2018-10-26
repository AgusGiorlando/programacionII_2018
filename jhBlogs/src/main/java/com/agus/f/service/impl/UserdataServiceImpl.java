package com.agus.f.service.impl;

import com.agus.f.service.UserdataService;
import com.agus.f.domain.Userdata;
import com.agus.f.repository.UserdataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.Optional;
/**
 * Service Implementation for managing Userdata.
 */
@Service
@Transactional
public class UserdataServiceImpl implements UserdataService {

    private final Logger log = LoggerFactory.getLogger(UserdataServiceImpl.class);

    private final UserdataRepository userdataRepository;

    public UserdataServiceImpl(UserdataRepository userdataRepository) {
        this.userdataRepository = userdataRepository;
    }

    /**
     * Save a userdata.
     *
     * @param userdata the entity to save
     * @return the persisted entity
     */
    @Override
    public Userdata save(Userdata userdata) {
        log.debug("Request to save Userdata : {}", userdata);        return userdataRepository.save(userdata);
    }

    /**
     * Get all the userdata.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public Page<Userdata> findAll(Pageable pageable) {
        log.debug("Request to get all Userdata");
        return userdataRepository.findAll(pageable);
    }


    /**
     * Get one userdata by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<Userdata> findOne(Long id) {
        log.debug("Request to get Userdata : {}", id);
        return userdataRepository.findById(id);
    }

    /**
     * Delete the userdata by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete Userdata : {}", id);
        userdataRepository.deleteById(id);
    }
}

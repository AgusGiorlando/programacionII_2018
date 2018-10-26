package com.agus.f.web.rest;

import com.codahale.metrics.annotation.Timed;
import com.agus.f.domain.Userdata;
import com.agus.f.service.UserdataService;
import com.agus.f.web.rest.errors.BadRequestAlertException;
import com.agus.f.web.rest.util.HeaderUtil;
import com.agus.f.web.rest.util.PaginationUtil;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing Userdata.
 */
@RestController
@RequestMapping("/api")
public class UserdataResource {

    private final Logger log = LoggerFactory.getLogger(UserdataResource.class);

    private static final String ENTITY_NAME = "userdata";

    private final UserdataService userdataService;

    public UserdataResource(UserdataService userdataService) {
        this.userdataService = userdataService;
    }

    /**
     * POST  /userdata : Create a new userdata.
     *
     * @param userdata the userdata to create
     * @return the ResponseEntity with status 201 (Created) and with body the new userdata, or with status 400 (Bad Request) if the userdata has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/userdata")
    @Timed
    public ResponseEntity<Userdata> createUserdata(@RequestBody Userdata userdata) throws URISyntaxException {
        log.debug("REST request to save Userdata : {}", userdata);
        if (userdata.getId() != null) {
            throw new BadRequestAlertException("A new userdata cannot already have an ID", ENTITY_NAME, "idexists");
        }
        Userdata result = userdataService.save(userdata);
        return ResponseEntity.created(new URI("/api/userdata/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * PUT  /userdata : Updates an existing userdata.
     *
     * @param userdata the userdata to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated userdata,
     * or with status 400 (Bad Request) if the userdata is not valid,
     * or with status 500 (Internal Server Error) if the userdata couldn't be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/userdata")
    @Timed
    public ResponseEntity<Userdata> updateUserdata(@RequestBody Userdata userdata) throws URISyntaxException {
        log.debug("REST request to update Userdata : {}", userdata);
        if (userdata.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        Userdata result = userdataService.save(userdata);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(ENTITY_NAME, userdata.getId().toString()))
            .body(result);
    }

    /**
     * GET  /userdata : get all the userdata.
     *
     * @param pageable the pagination information
     * @return the ResponseEntity with status 200 (OK) and the list of userdata in body
     */
    @GetMapping("/userdata")
    @Timed
    public ResponseEntity<List<Userdata>> getAllUserdata(Pageable pageable) {
        log.debug("REST request to get a page of Userdata");
        Page<Userdata> page = userdataService.findAll(pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, "/api/userdata");
        return new ResponseEntity<>(page.getContent(), headers, HttpStatus.OK);
    }

    /**
     * GET  /userdata/:id : get the "id" userdata.
     *
     * @param id the id of the userdata to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the userdata, or with status 404 (Not Found)
     */
    @GetMapping("/userdata/{id}")
    @Timed
    public ResponseEntity<Userdata> getUserdata(@PathVariable Long id) {
        log.debug("REST request to get Userdata : {}", id);
        Optional<Userdata> userdata = userdataService.findOne(id);
        return ResponseUtil.wrapOrNotFound(userdata);
    }

    /**
     * DELETE  /userdata/:id : delete the "id" userdata.
     *
     * @param id the id of the userdata to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/userdata/{id}")
    @Timed
    public ResponseEntity<Void> deleteUserdata(@PathVariable Long id) {
        log.debug("REST request to delete Userdata : {}", id);
        userdataService.delete(id);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert(ENTITY_NAME, id.toString())).build();
    }
}

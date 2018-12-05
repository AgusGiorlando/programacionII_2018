package ar.edu.um.programacion2.cine.web.rest;

import java.math.BigDecimal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codahale.metrics.annotation.Timed;

import ar.edu.um.programacion2.cine.domain.Ticket;
import ar.edu.um.programacion2.cine.repository.ClienteRepository;
import ar.edu.um.programacion2.cine.repository.TicketRepository;

/**
 * REST controller for managing Cliente.
 */
@RestController
@RequestMapping("/api")
public class EstadisticaResource {

    private final Logger log = LoggerFactory.getLogger(EstadisticaResource.class);

    private static final String ENTITY_NAME = "cliente";

    @Autowired
    private ClienteRepository clienteRepository;
    
    @Autowired
    private TicketRepository ticketRepository;

    public EstadisticaResource() { }

    /**
     * GET  /clientes : get all the clientes.
     *
     * @return the ResponseEntity with status 200 (OK) and the list of clientes in body
     */
    @GetMapping("/estadisticas/recudacion")
    @Timed
    public String getAllPagos() {
        log.debug("REST request to get all Pagos al cine");
        
        BigDecimal recaudacion = BigDecimal.ZERO;
        
        List<Ticket> tickets = ticketRepository.findAll();
        
        for (int i = 0; i < tickets.size(); i++) {
        	recaudacion = tickets.get(i).getImporte().add(recaudacion);
		}
        
        return recaudacion.toString();
    }

}

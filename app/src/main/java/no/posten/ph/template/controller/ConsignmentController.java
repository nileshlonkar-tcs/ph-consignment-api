package no.posten.ph.template.controller;

import no.posten.ph.consignment.model.Consignment;
import no.posten.ph.template.service.ConsignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ConsignmentController {

    @Autowired
    ConsignmentService consignmentService;



    @GetMapping("/consignment/{consignmentNumber}")
    public Mono<Consignment> getConsignmentByNumber(@PathVariable Integer consignmentNumber){

        return consignmentService.readConsignmentByNumber(consignmentNumber);
    }

}

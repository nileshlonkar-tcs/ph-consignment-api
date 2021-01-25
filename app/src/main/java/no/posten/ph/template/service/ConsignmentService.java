package no.posten.ph.template.service;


import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import no.posten.ph.consignment.model.Consignment;
import no.posten.ph.consignment.model.ConsignmentEvent;
import no.posten.ph.template.dao.ConsignmentRepository;
import no.posten.ph.template.mapper.ConsignmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ConsignmentService {

    @Autowired
    ConsignmentRepository consignmentRepository;

    public Mono<Consignment> readConsignmentByNumber(Integer consignmentNumber) {
       /*return consignmentRepository.findById("EDIConsignment", new PartitionKey("1001"))
                .map(consignmentDO -> ConsignmentMapper.transformDOtoModel(consignmentDO));
*/
        Mono<Consignment> consignment = consignmentRepository.findByDocumentTypeAndConsignmentNo("EDIConsignment", String.valueOf(consignmentNumber))
                .map(consignmentDO -> ConsignmentMapper.transformDOtoModel(consignmentDO));

        //Flux<ConsignmentEvent> consignmentEvent = consignmentRepository.findByCon

        return  consignment;
    }
}

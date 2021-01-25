package no.posten.ph.template.dao;


import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import no.posten.ph.template.domain.Consignment;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

/**
 *
 */
@Repository
public interface ConsignmentRepository extends ReactiveCosmosRepository<Consignment, String> {


    Mono<Consignment> findById(String id, PartitionKey partitionKey);

    Mono<Consignment> findByDocumentTypeAndConsignmentNo(String documentType, String consignmentNo);
}

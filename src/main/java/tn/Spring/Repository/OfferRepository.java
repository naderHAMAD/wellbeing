package tn.Spring.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.Spring.Entity.Offer;

@Repository

public interface OfferRepository extends CrudRepository<Offer ,Integer> {

}

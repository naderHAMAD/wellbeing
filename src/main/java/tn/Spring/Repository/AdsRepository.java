package tn.Spring.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.Spring.Entity.Ads;

@Repository
public interface AdsRepository extends CrudRepository <Ads , Integer> {

}

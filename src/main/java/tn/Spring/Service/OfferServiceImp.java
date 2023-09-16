package tn.Spring.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.Spring.Entity.Offer;
import tn.Spring.Repository.OfferRepository;

@Service
public class OfferServiceImp implements IOfferService {

	@Autowired
	OfferRepository OfferRepo;

	@Override
	public Offer addOffer(Offer offer) {
		// TODO Auto-generated method stub
		return OfferRepo.save(offer);
	}

	@Override
	public void deleteOffer(int id) {
		// TODO Auto-generated method stub
		OfferRepo.deleteById(id);
		
	}

	@Override
	public Offer updateOffer(Offer offer) {
		// TODO Auto-generated method stub
		return OfferRepo.save(offer);
	}
	
	
}

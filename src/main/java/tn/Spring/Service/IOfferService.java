package tn.Spring.Service;

import tn.Spring.Entity.Offer;

public interface IOfferService {
	
	 Offer addOffer(Offer offer);

	 void deleteOffer(int id);

	 Offer updateOffer(Offer offer);

}

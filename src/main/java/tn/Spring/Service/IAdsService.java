package tn.Spring.Service;

import tn.Spring.Entity.Ads;

public interface IAdsService {
	
	 Ads addAds(Ads ads);

	 void deleteAds(int id);

	 Ads updateAds(Ads ads);
}

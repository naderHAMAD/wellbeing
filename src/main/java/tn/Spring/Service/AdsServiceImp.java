package tn.Spring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.Spring.Entity.Ads;
import tn.Spring.Repository.AdsRepository;

@Service
public class AdsServiceImp implements IAdsService {
	
	@Autowired	
    AdsRepository AdsRepo;

	@Override
	public Ads addAds(Ads ads) {
		// TODO Auto-generated method stub
		 return AdsRepo.save(ads);
	}

	@Override
	public void deleteAds(int id) {
		// TODO Auto-generated method stub
		AdsRepo.deleteById(id);
		
	}

	@Override
	public Ads updateAds(Ads ads) {
		// TODO Auto-generated method stub
		return AdsRepo.save(ads);
	}
	

}

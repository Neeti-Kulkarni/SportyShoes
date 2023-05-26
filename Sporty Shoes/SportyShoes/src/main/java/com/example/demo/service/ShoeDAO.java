package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Shoes;
import com.example.demo.repo.ShoesRepo;

@Service
public class ShoeDAO {
	@Autowired
	ShoesRepo repo;

	
	public Shoes insert(Shoes e) {				
		return repo.save(e);
	}
	
	public Shoes insertByRest(Shoes e) {
		return repo.save(e);
	}
	
	public String delete(Shoes e) {
		repo.delete(e);
		return "Deleted";
	}
	public List<Shoes> getall(){
		return repo.findAll();
	}
	
	public Shoes updateByName(Shoes e) {
		Shoes ee=repo.findById(e.getSh_id()).orElse(null);
		ee.setSh_name(e.getSh_name());
		ee.setSh_price(e.getSh_price());
	return	repo.save(ee);
		
	}
	
}
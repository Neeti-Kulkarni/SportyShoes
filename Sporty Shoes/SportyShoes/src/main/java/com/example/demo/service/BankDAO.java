package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AdminDetails;
import com.example.demo.model.BankDetails;
import com.example.demo.repo.BankRepo;

@Service
public class BankDAO {
	@Autowired
	BankRepo repo;
	
	public BankDetails insert(BankDetails e) {
		return repo.save(e);
	}
	
	public List<BankDetails> insertall(List<BankDetails> ad){
		return repo.saveAll(ad);
	}
	
	public BankDetails findBalance(int id) {
		return repo.getById(id);
	}

}
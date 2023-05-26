package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AdminDetails;
import com.example.demo.repo.AdminRepo;

@Service
public class AdminDAO {
	@Autowired
	AdminRepo repo;
	
	public AdminDetails insert(AdminDetails e) {
		return repo.save(e);
	}
	public String adCheck(String s) {
		return repo.adCheck(s);
	}
	
	public List<AdminDetails> insertall(List<AdminDetails> ad){
		return repo.saveAll(ad);
	}
	
	public void deletebyid(int id) {
		repo.deleteById(id);
		}

}
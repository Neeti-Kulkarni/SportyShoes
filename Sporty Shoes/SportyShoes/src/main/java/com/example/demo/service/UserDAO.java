package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.UserDetails;
import com.example.demo.repo.UserRepo;

@Service
public class UserDAO {
	@Autowired
	UserRepo repo;
	
	public UserDetails insert(UserDetails e) {
		return repo.save(e);
	}
	
	public String ifExists(String s) {
		return repo.ifExist(s);
		
	}
	

	public List<UserDetails> getall(){
		return repo.findAll();
	}
	
	public String updatePurchase(String name,String uname) {
		 repo.setShoePurchase(name, uname);
		 return "updated";
		
	}
}

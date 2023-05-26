package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AdminDetails;
import com.example.demo.service.AdminDAO;

@RestController
public class AdminRestController {
	@Autowired
	AdminDAO dao;
	
	@PostMapping("/insertadmin")
	public AdminDetails insert(@RequestBody AdminDetails e) {
		return dao.insert(e);
	}
	
	@PostMapping("/insertalladmin")
	public List<AdminDetails> insertall(@RequestBody List<AdminDetails> ad){
		return dao.insertall(ad);
	}
	
	@DeleteMapping("/deletebyid")
	public void deletebyid(int id) {
		dao.deletebyid(id);
	}
}
package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AdminDetails;
import com.example.demo.model.BankDetails;
import com.example.demo.service.BankDAO;

@RestController
public class BankRestController {
	@Autowired
	BankDAO dao;
	@PostMapping("/insertbank")
	public BankDetails insert(@RequestBody BankDetails e) {
		return dao.insert(e);
	}
	
	@PostMapping("/insertallbank")
	public List<BankDetails> insertall(@RequestBody List<BankDetails> bd){
		return dao.insertall(bd);
	}

}




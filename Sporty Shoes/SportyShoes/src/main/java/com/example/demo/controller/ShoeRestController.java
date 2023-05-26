package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Shoes;
import com.example.demo.service.ShoeDAO;

@RestController
public class ShoeRestController {
	@Autowired
	ShoeDAO dao;
	
	@PostMapping("/insertshoe")
	public Shoes insert(@RequestBody Shoes e) {
		return dao.insertByRest(e);
	}
}
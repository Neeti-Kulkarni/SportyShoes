package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.BankDetails;

public interface BankRepo extends JpaRepository<BankDetails, Integer>{


	
}


package com.example.demo.repo;



import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.model.Shoes;

public interface ShoesRepo extends JpaRepository<Shoes, Integer> {
	//public Optional<Shoes> findByName(String filename);
}
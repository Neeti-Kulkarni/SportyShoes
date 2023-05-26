package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.AdminDetails;

public interface AdminRepo extends JpaRepository<AdminDetails, Integer> {
@Query("select a.password from AdminDetails a where a.ad_username=?1")
public String adCheck(String s);

}
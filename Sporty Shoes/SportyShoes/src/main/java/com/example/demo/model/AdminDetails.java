package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class AdminDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int a_id;
	private String ad_username;
	private String password;
}
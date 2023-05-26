package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Shoes {
	@Id
	private int sh_id;
	private String sh_name;
	private long sh_price;
	private String filepath;
	
}
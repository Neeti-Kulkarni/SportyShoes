package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.Data;

@Data
@Entity
public class UserDetails {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int u_id;

private String f_name;
private String l_name;
private String DOB;
private String username;
private String password;
private String shoe_purchased;

}
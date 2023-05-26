package com.example.demo.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.UserDetails;

public interface UserRepo extends JpaRepository<UserDetails, Integer> {
@Query("select u.password from UserDetails u where u.username=?1")
	public String ifExist(String s);

@Query("update UserDetails u set u.shoe_purchased=?1 where u.username=?2")
public String setShoePurchase(String name,String uname);
}
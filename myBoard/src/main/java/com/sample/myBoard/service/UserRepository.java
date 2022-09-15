package com.sample.myBoard.service;

//import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.myBoard.domain.User;


public interface UserRepository{

	public void save(User user);
	
	public User findUser(String userId);
}

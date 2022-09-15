package com.sample.myBoard.service;

import com.sample.myBoard.domain.User;

public interface UserService {
	
	public void addUser(User user);
	
	public User getUser(String userId);

}

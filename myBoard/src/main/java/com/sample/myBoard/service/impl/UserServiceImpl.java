package com.sample.myBoard.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sample.myBoard.domain.User;
import com.sample.myBoard.service.UserRepository;
import com.sample.myBoard.service.UserService;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	
	@Autowired
//	@Qualifier("userRepositoryImpl")
	private final UserRepository userRe;
	
	
	@Override
	public void addUser(User user) {
		System.out.println("addUser start");
		userRe.save(user);
		System.out.println("====== addUser Test END... =======");
		
	}


	@Override
	public User getUser(String userId) {		
		return userRe.findUser(userId);
	}

}

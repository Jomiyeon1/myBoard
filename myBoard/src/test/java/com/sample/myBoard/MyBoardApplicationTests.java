package com.sample.myBoard;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sample.myBoard.domain.User;
import com.sample.myBoard.service.UserService;

@SpringBootTest
class MyBoardApplicationTests {
	@Autowired
	private UserService userService;
	//@Test
	void contextLoads() {
	}
	
	@Test
	void addUserTest() {
		User user = new User();
		
		user.setUserId("testId");
		user.setName("name");
		user.setPassword("1234");
		
		userService.addUser(user);
		
		
		
	}

}

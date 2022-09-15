package com.sample.myBoard.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sample.myBoard.domain.User;
import com.sample.myBoard.service.UserService;

@Controller
@RequestMapping("/user/*")
public class UserController {
	
	@Autowired
//	@Qualifier("userServiceImpl")
	private UserService userService;
	
	public UserController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("addUser")
	public ModelAndView addUser(ModelAndView mv) {
		mv.setViewName("/user/addUser");
		return mv;
	}
	
	@PostMapping("addUser")
	public ModelAndView addUser(ModelAndView mv, @ModelAttribute User user) {
		System.out.println("user ???????? "+user);
		userService.addUser(user);
		
		mv.addObject("user",user);
		mv.setViewName("/user/joinSuccess");
		System.out.println("addUser POST ===");
		return mv;
	}
	
	@GetMapping("getUser/{userId}")
	public ModelAndView getUser(ModelAndView mv, @PathVariable String userId) {
		
		User user = userService.getUser(userId);
		mv.addObject("user", user);
		mv.setViewName("/user/getUser");
		return mv;
	}
	

}

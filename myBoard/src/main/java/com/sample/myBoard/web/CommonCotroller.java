package com.sample.myBoard.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommonCotroller {

	public CommonCotroller() {
		// TODO Auto-generated constructor stub
	}
	@GetMapping(value = "/")
	public ModelAndView commonIndex( ModelAndView mv ) {
		
		mv.setViewName("index");
		return mv;
		
	}

}

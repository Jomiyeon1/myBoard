package com.example.MyBoard.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/*")
public class CommonController {

    @GetMapping
    public ModelAndView first(ModelAndView mv){
        mv.setViewName("index");
        return mv;
    }

    @GetMapping("1")
    public String index2(){
        return "index";
    }
}

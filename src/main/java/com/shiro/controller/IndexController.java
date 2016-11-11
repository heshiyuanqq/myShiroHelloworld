package com.shiro.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {

	 	@RequestMapping("/welcome")
	    public String welcomePage(HttpServletRequest request, String msg,ModelMap model){
	 			return "index";
	    }
	
}

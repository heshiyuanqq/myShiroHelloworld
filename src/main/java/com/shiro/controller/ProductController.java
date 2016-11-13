package com.shiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/productWorker")
public class ProductController {

	
	@RequestMapping("/index")
	public String employeeIndex(){
		
		return "/WEB-INF/needAuthorization/productWorker/index.jsp";
	}
	@RequestMapping("/productBoss/index")
	public String bossIndex(){
		
		return "/WEB-INF/needAuthorization/productWorker/productBoss/index.jsp";
	}
	
	
}

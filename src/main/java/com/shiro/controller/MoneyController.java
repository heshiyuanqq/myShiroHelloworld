package com.shiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/moneyWorker")
public class MoneyController {
	
	@RequestMapping("/index")
	public String employeeIndex(){
		
		return "/WEB-INF/needAuthorization/moneyWorker/index.jsp";
	}
	
	@RequestMapping("/moneyBoss/index")
	public String  bossIndex(){
		
		return "/WEB-INF/needAuthorization/moneyWorker/moneyBoss/index.jsp";
	}

}

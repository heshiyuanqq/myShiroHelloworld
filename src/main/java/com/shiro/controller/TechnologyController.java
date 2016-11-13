package com.shiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/technologyWorker")
public class TechnologyController {
	
	   @RequestMapping("/index")
	   public String employeeIndex(){
		   
		   return "/WEB-INF/needAuthorization/technologyWorker/index.jsp";
	   }
	   
	   @RequestMapping("/technologyBoss/index")
	   public String   bossIndex(){
		   
		   return "/WEB-INF/needAuthorization/technologyWorker/technologyBoss/index.jsp";
	   }
	

}

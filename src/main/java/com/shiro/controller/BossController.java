package com.shiro.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/boss")
public class BossController {
	
	@RequestMapping("/index")
	public String index(HttpServletRequest request,HttpSession session){
			System.out.println("*****************************tomcat的resuest:"+request+",tomcat的session:"+session+"**************************");
			return "/needAuthorization/boss/index.jsp";
	}

}

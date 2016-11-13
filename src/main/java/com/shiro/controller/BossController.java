package com.shiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/boss")
public class BossController {
	
	@RequestMapping("/index")
	public String index(){
		
		return "/needAuthorization/boss/index.jsp";
	}

}

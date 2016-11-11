package com.shiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/needAuthentication")
public class NeedAuthenticationController {

	
	@RequestMapping("/resource1")
	public String   resource1(){
		return "resource1";
		
	}
	@RequestMapping("/resource2")
	public String   resource2(){
		return "resource2";
		
	}
	@RequestMapping("/resource3")
	public String   resource3(){
		return "resource3";
		
	}
}

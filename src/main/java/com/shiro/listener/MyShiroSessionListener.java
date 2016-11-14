package com.shiro.listener;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.SessionListener;
import org.apache.shiro.subject.Subject;

import com.shiro.utils.ShiroAuthorizationHelper;

public class MyShiroSessionListener implements SessionListener{

	@Override
	public void onStart(Session session) {
		System.out.println("************shiro的session："+session+"创建了***************");
	}

	@Override
	public void onStop(Session session) {
		System.out.println("************shiro的session："+session+"销毁了***************");
		String username = (String) session.getAttribute("username");
		Subject subject = SecurityUtils.getSubject();
		Session session2 = subject.getSession();
		
		System.out.println(session.getId());
		System.out.println(session2.getId());
		System.out.println("sss");
		ShiroAuthorizationHelper.clearAuthorizationInfo(username);
		
	}

	@Override
	public void onExpiration(Session session) {
		System.out.println("************shiro的session："+session+"过期了***************");
	}

}

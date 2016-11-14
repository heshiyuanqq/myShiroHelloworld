package com.shiro.realm;

import java.util.List;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.mgt.eis.SessionDAO;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.shiro.pojo.User;
import com.shiro.service.UserService;

public class MyJdbcRealm  extends AuthorizingRealm{
	 private final static Logger LOG = LoggerFactory.getLogger(MyJdbcRealm.class);
	 public final static String REALM_NAME = "myJdbcRealm";
	
	 
	 @Autowired
	 private UserService userService;
	 
	 public MyJdbcRealm() {
		 	        setName(REALM_NAME); // This name must match the name in the User
		 	                                // class's getPrincipals() method
		 	    //  setCredentialsMatcher(new Sha256CredentialsMatcher());
	  }
	
	 /**
	   * 认证
	   */
	  protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
		      UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
		      String username = token.getUsername();
		      if(LOG.isTraceEnabled()){
		          		LOG.trace("开始认证 "+ username);
		      }
		      try {
			          if(StringUtils.isBlank(username)){
			              	throw new AccountException("can not handle this login,cause username is null!");
			          }
			          
					  User user = userService.getByUsername(username);
					  if(user==null){
						  return null;
					  }
					  
					  
					  
					  return new SimpleAuthenticationInfo(user.getUsername(), user.getPassword(), getName());
		      } catch (Exception e) {
		          	  throw translateAuthenticationException(e);
		      }
	  }
	
	   
	  
	
	  /**
	   * 授权
	   */
	  protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		      String username = (String)getAvailablePrincipal(principals);
		      if(LOG.isTraceEnabled()){
		          		LOG.trace("开始授权  for user: "+ username);
		      }
		      User user = userService.getByUsername(username);
		      SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		      List<String> roles=userService.getRolenameListByUsername(username);
		      System.out.println("开始为用户："+username+"授权！");
		      System.out.print("授予权限为：");
		      for (String role : roles) {
		    	  System.out.print(role+",");
			  }
		      System.out.println();
		      info.addRoles(roles);
		      return info;
	  }
	
	
	
	  /**
	   * 异常转换
	   */
	  private AuthenticationException translateAuthenticationException(Exception e) {
		      if (e instanceof AuthenticationException) {
		          	return (AuthenticationException) e;
		      }
		      if(e instanceof DisabledAccountException){
		          	return (DisabledAccountException)e;
		      }
		      if(e instanceof UnknownAccountException){
		          	return (UnknownAccountException)e;
		      }
		      return new AuthenticationException(e);
	  }
	
}

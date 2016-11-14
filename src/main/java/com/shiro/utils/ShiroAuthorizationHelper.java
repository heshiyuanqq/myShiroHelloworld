package com.shiro.utils;
import java.io.Serializable;  
import java.util.Set;

import org.apache.shiro.SecurityUtils;  
import org.apache.shiro.cache.Cache;  
import org.apache.shiro.subject.Subject;

import com.shiro.realm.MyJdbcRealm;
  
  
/** 
 * @author Dylan 
 * @time 2014年1月8日 
 */  
public class ShiroAuthorizationHelper {  
    private static MyShiroCacheManager cacheManager;  
      
    /** 
     * 清除指定用户的授权信息 
     * @param username 
     */  
    public static void clearAuthorizationInfo(String username){  
	        //ShiroCasRealm.authorizationCache 为shiro自义cache名(shiroCasRealm为我们定义的reaml类的类名)  
	    	//   Cache<Object, Object> cache = cacheManager.getCache(ShiroRealm.REALM_NAME+".authorizationCache");  
	    	//Cache<Object, Object> cache = cacheManager.getCache(MyJdbcRealm.REALM_NAME+".authorizationCache");
    		Cache<Object, Object> cache = cacheManager.getCache("shiro-activeSessionCache");
	    	Set<Object> keys = cache.keys();
	    	for (Object key : keys) {
	    		System.out.println(key+"="+cache.get(key));
				
			}
	    	
	    	
	    	String string = cacheManager.toString();
	    	System.out.println(string);
	        cache.remove(username);  
    }  
      
    /** 
     * 清除当前用户的授权信息 
     */  
    public static void clearAuthorizationInfo(){  
	    	Subject subject = SecurityUtils.getSubject();
	        if(subject.isAuthenticated()){  
	            clearAuthorizationInfo(subject.getPrincipal()+"");  
	        }  
    }  
      
    /**清除session(认证信息) 
     * @param JSESSIONID 
     */  
    public static void clearAuthenticationInfo(Serializable JSESSIONID){  
	        //shiro-activeSessionCache 为shiro自义cache名，该名在org.apache.shiro.session.mgt.eis.CachingSessionDAO抽象类中定义  
	        //如果要改变此名，可以将名称注入到sessionDao中，例如注入到CachingSessionDAO的子类EnterpriseCacheSessionDAO类中  
	        Cache<Object, Object> cache = cacheManager.getCache("shiro-activeSessionCache");  
	        cache.remove(JSESSIONID);  
    }  
  
    public static MyShiroCacheManager getCacheManager() {  
        return cacheManager;  
    }  
  
    public static void setCacheManager(MyShiroCacheManager cacheManager) {  
        	ShiroAuthorizationHelper.cacheManager = cacheManager;  
    }  
      
      
}  
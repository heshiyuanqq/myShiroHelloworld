package com.shiro.utils;

public final class HttpSessionIdHolder {
	
	
	private HttpSessionIdHolder(){}
	
	
	private final static ThreadLocal<String> SESSIONID=new ThreadLocal<String>();
	
	
	public static void setSessionId(String sessionId){
		   SESSIONID.set(sessionId);
		
	}
	public static String getSessionId(){
			return SESSIONID.get();
	}
	public static void removeSessionId(){
		  SESSIONID.remove();
	}

}

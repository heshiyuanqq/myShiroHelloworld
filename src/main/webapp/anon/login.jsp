<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>this is login.jsp</title>
</head>
<body>
		<h1>login page</h1>  
	    <form id="" action="${pageContext.request.contextPath}/login/doLogin" method="post">  
		        <label>User Name</label> 
		        <input tyep="text" name="username"    maxLength="40" /> <br/>
		        
		        <label>Password</label>
		        <input type="password"  name="password" /><br/>
		        <input type="checkbox" name="rememberMe" value="true" >记住我<br/>
		        <input type="submit" value="登录"/>
	    </form>  
	    <%--用于输入后台返回的验证错误信息 --%>  
	    <P>
	    <font color="red">
	    		<c:out value="${msg }" />
	    </font></P>  
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>this is index.jsp!</title>
</head>
<body>
     	<c:choose>
     		<c:when test="${empty sessionScope.loginUser }">
     			请登录！
     		</c:when>
     		<c:otherwise>
     		   	 欢迎您！${sessionScope.loginUser.username }
     		</c:otherwise>
     	</c:choose>
</body>
</html>
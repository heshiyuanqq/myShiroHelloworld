<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
      <h1>这里是主页（已经认证通过了）</h1>
      
      <a href="${pageContext.request.contextPath}/boss/index">访问老板的资源</a><br/>
      <a href="${pageContext.request.contextPath}/technologyWorker/technologyBoss/index">访问技术总监的资源</a><br/>
      <a href="${pageContext.request.contextPath}/moneyWorker/moneyBoss/index">访问财务总监的资源</a><br/>
      <a href="${pageContext.request.contextPath}/productWorker/productBoss/index">访问产品总监的资源</a><br/>
      <a href="${pageContext.request.contextPath}/technologyWorker/index">访问技术部员工的资源</a><br/>
      <a href="${pageContext.request.contextPath}/moneyWorker/index">访问财务部员工的资源</a><br/>
      <a href="${pageContext.request.contextPath}/productWorker/index">访问产品部员工的资源</a><br/>
      <a href="${pageContext.request.contextPath}/login/logout">退出</a>
</body>
</html>
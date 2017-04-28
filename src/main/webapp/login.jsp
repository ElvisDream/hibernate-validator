<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
 <spring:form action="login.do" method="post" commandName="userBean">
		name:<input type="text" name="username"><spring:errors delimiter="," path="username"></spring:errors><br />
		 pwd:<input type="password" name="password"><spring:errors delimiter="," path="password"></spring:errors><br /> 
		 <input type="submit">
	</spring:form>
</body>
</html>
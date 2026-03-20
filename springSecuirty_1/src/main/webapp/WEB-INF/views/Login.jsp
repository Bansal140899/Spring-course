<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored = "false" %>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h2>Log in here</h2>
  
  <c:if test ="${not empty login_error }">
  <b>${ login_error }</b>
  </c:if>
  
  
  
  <form action="LoginForm" method="POST">
  
  
  Email ID :<input type="text" name="email1" /><br></br>
  Password :<input type="password" name ="pass1"/><br></br>
  <input type="submit" value="LOGIN" />
  
  
  </form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix ="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
     <h2>Register Here</h2>
     
     
  

<form:form action="regForm" method="POST" modelAttribute="modell_std">

Name:
<form:input path="name"/><form:errors path="name"></form:errors><br><br>

Email:
<form:input path="email"/><br><br>

Password:
<form:password path="pass"/><br><br>

Gender:
<form:radiobutton path="gender" value="Male"/> Male
<form:radiobutton path="gender" value="Female"/> Female
<br><br>

City:
<form:select path="city">
    <form:option value="Delhi" label="Delhi"/>
    <form:option value="Mumbai" label="Mumbai"/>
    <form:option value="Jaipur" label="Jaipur"/>
</form:select>
<br><br>

<input type="submit" value="Register"/>

</form:form>
     
    
     
     
     
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>welcome : ${model_std.getName()}</h1>
    <h1>email : ${model_std.getEmail()}</h1>
    <h1>pass : ${model_std.getPass()}</h1>
      
      <h1>Gender : ${model_std.getGender()}</h1>
      
      <h1>city : ${model_std.getCity()}</h1>
      
      
      
</body>
</html>
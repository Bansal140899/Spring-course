<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>

<style>
body {
    margin: 0;
    padding: 0;
    font-family: Arial, sans-serif;
    background: linear-gradient(135deg, #4facfe, #00f2fe);
    height: 100vh;
    display: flex;
    justify-content: center;
    align-items: center;
}

.login-container {
    background: #fff;
    padding: 30px 40px;
    border-radius: 12px;
    box-shadow: 0 8px 25px rgba(0,0,0,0.2);
    width: 320px;
    text-align: center;
}

.login-container h3 {
    margin-bottom: 20px;
    color: #333;
}

.input-group {
    margin-bottom: 15px;
    text-align: left;
}

.input-group label {
    font-size: 14px;
    color: #555;
}

.input-group input {
    width: 100%;
    padding: 10px;
    margin-top: 5px;
    border-radius: 6px;
    border: 1px solid #ccc;
    outline: none;
    transition: 0.3s;
}

.input-group input:focus {
    border-color: #4facfe;
    box-shadow: 0 0 5px rgba(79,172,254,0.5);
}

button {
    width: 100%;
    padding: 10px;
    background: #4facfe;
    border: none;
    border-radius: 6px;
    color: white;
    font-size: 16px;
    cursor: pointer;
    transition: 0.3s;
}

button:hover {
    background: #007bff;
}
</style>

</head>
<body>

<div class="login-container">
    <h3>Login</h3>

    <form action='<c:url value="/login" />' method="post">
        <div class="input-group">
            <label>User Name</label>
            <input type="text" name="username" required />
        </div>

        <div class="input-group">
            <label>Password</label>
            <input type="password" name="password" required />
        </div>
<input type="hidden" 
       name="${_csrf.parameterName}" 
       value="${_csrf.token}" />
        <button type="submit">Login</button>
    </form>
</div>

</body>
</html>
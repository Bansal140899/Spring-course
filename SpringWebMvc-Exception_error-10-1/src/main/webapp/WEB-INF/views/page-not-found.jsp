<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>404 - Page Not Found</title>

<style>

body{
    margin:0;
    padding:0;
    font-family: Arial, sans-serif;
    background: linear-gradient(135deg,#667eea,#764ba2);
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
}

.container{
    text-align:center;
    color:white;
}

.container h1{
    font-size:120px;
    margin:0;
}

.container h2{
    font-size:35px;
    margin:10px 0;
}

.container p{
    font-size:18px;
    margin-bottom:25px;
}

.home-btn{
    text-decoration:none;
    padding:12px 25px;
    background:white;
    color:#764ba2;
    border-radius:25px;
    font-weight:bold;
    transition:0.3s;
}

.home-btn:hover{
    background:#eee;
}

</style>

</head>

<body>

<div class="container">
    <h1>404</h1>
    <h2>Page Not Found</h2>
    <p>Sorry! The page you are looking for does not exist.</p>

    <a href="index.jsp" class="home-btn">Go Back Home</a>
</div>

</body>
</html>
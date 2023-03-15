<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<from method="post" >
    Username:<input type=""text" name="username"/><br/>
    password: <input type=""password" name="password"/><br/>
    <input type="submit" value="Send Data to Server"/>
</from>
</from>
</body>
</html>
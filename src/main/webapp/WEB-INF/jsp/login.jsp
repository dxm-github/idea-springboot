<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录界面</title>
</head>
<body>
登录界面测试
<c:if test="${msg!=null}">
	<p style="color:red">${msg}</p>
</c:if>
<form action="login.do">
	用户名:<input type="text" name="username"><br>
	密码:<input type="password" name="pwd"><br>
	<input type="submit" value="登录">
</form>
</body>
</html>
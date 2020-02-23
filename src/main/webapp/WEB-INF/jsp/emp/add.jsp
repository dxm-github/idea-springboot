<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新增员工页面</title>
<script type="text/javascript"></script>
</head>
<body>

<form action="/emp" method="post">
		<c:if test="${emp!=null}">
		<input type="hidden" name="_method" value="PUT"/>
		<input type="hidden" name="id" value="${emp.id}"></c:if>
	姓名:<input type="text" name="name" value="${emp.name}"><br>
	性别:
		<c:if test="${emp==null||emp.sex==1}">
		<input type="radio" value="1" name="sex" checked="checked">男
		<input type="radio" value="2" name="sex">女<br>
		</c:if>
		<c:if test="${emp.sex==2}">
		<input type="radio" value="1" name="sex" >男
		<input type="radio" value="2" name="sex" checked="checked">女<br>
		
		</c:if>
		
	年龄:<input type="number" name="age" min="0" max="80" value="${emp.age}"><br>
	收入:<input type="number" name="salary" min="2000" max="100000" value="${emp.salary}"><br>
	<input type="submit" value="提交">
</form>
</body>
</html>
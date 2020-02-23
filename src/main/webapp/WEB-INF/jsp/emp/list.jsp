<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>员工列表页面</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/webjars/jquery/3.3.1/jquery.js"></script>
<script type="text/javascript">
	$(function(){
		
	})
</script>
</head>
<body>
<input type="button" value="新增员工" onclick="window.location='emp'">
<table cellspacing="0"  cellpadding="0" border="1" width="500px">
	<thead>
		<tr>
			<th>编号</th>
			<th>姓名</th>
			<th>性别</th>
			<th>年龄</th>
			<th>收入</th>
			<th></th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${list}" var="i" varStatus="xh">
		<tr>
			<td>${xh.count}</td>
			<td>${i.name}</td>
			<td>
			<c:if test="${i.sex==1}">男</c:if>
			<c:if test="${i.sex==2}">女</c:if>
			<c:if test="${i.sex!=2&&i.sex!=1}">未知</c:if>
			</td>
			<td>${i.age}</td>
			<td>${i.salary}</td>
			<td>
				<input type="button" value="修改" onclick="window.location.href='emp/'+'${i.id}'">
				<form action="/emp/${i.id}" method="post" style="display:inline">
				<input type="hidden" name="_method" value="delete">
				<input type="submit" value="删除" >
				</form>
			</td>
		</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>
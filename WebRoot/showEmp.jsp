<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>员工信息列表</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
</head>
<body>
	<table border="1" align="center">
		<c:forEach var="list" items="${list}">
			<tr>
				<td>员工编辑</td>
				<td>${list.empid}</td>
			</tr>
			<tr>
				<td>姓名</td>
				<td>${list.ename}</td>
			</tr>
			<tr>
				<td>性别</td>
				<td><c:if test="${list.egendar=='0'}">女</c:if> <c:if
						test="${list.egendar=='1'}">男</c:if>
				</td>
			</tr>
			<tr>
				<td>部门名称</td>
				<td>${list.dname}</td>
			</tr>
		</c:forEach>
		<tr>
				<td colspan="2"><a href="showAll.form">返回</a></td>
			</tr>
	</table>
</body>
</html>

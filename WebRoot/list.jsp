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
		<tr>
			<td>员工编辑</td>
			<td>姓名</td>
			<td>部门名称</td>
			<td>操作</td>
		</tr>
		<c:forEach var="list" items="${list}">
			<tr>
				<td>${list.empid}</td>
				<td><a href="showEmp.form?id=${list.empid}">${list.ename}</a></td>
				<td>${list.dname}</td>
				<td><a href="del.form?did=${list.empid}">删除</a>&nbsp;&nbsp;&nbsp;<a href="getDeptsAll.form?id=${list.empid}">修改</a></td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="4"><a href="DeptsAll.form">添加</a></td>
		</tr>
	</table>
</body>
</html>

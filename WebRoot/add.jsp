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
	<form action="add.form" method="post">
		<table border="1" align="center">
			<tr>
				<td>员工编辑</td>
				<td><input type="text" name="empid" /></td>
			</tr>
			<tr>
				<td>姓名</td>
				<td><input type="text" name="ename" /></td>
			</tr>
			<tr>
				<td>性别</td>
				<td><input type="radio" value="0" name="egendar" />女 <input
					type="radio" value="1" name="egendar" />男</td>
			</tr>
			<tr>
				<td>部门名称</td>
				<td><select name="depid">
						<c:forEach var="listDept" items="${listDept1}">
							<option value="${listDept.deptid}">${listDept.dname}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td><input type="submit" value="提交" /></td>
				<td><input type="button" value="重置" /></td>
			</tr>
		</table>
	</form>
</body>
</html>
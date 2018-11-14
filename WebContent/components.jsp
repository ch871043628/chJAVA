<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
#a {
	align-content: center;
}
</style>
<meta charset="utf-8">
<title>查看电脑配件</title>
</head>
<body>
	<form action="all">
		<h3 align="center"><a href="index.jsp">返回主页</a></h3>
		<table border="2" align="center">
			<tr>
				<th>序号</th>
				<th>名称</th>
				<th>容量</th>
				<th>价格</th>
			</tr>
			<s:iterator value="components" var="c">
				<tr>
					<td>${c.component_id}</td>
					<td>${c.componentName}</td>
					<td>${c.capacity}</td>
					<td>${c.price}</td>
				</tr>
			</s:iterator>
		</table>
		<table align="center">
			<tr>
				<td>
				<a href="findAllpage?currentPage=1&pageSize=2" id="" >首页</a>
				<a href="findAllpage?currentPage=${currentPage-1 }&pageSize=2" >上 一页</a> 
				<a href="findAllpage?currentPage=${currentPage+1 }&pageSize=2" >下一页</a>
				<a href="findAllpage?currentPage=3&pageSize=2" >尾页</a>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
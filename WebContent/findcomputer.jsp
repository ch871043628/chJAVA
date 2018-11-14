<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
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
	<form action="findAllcomputer">
		<h3 align="center"><a href="index.jsp">返回主页</a></h3>
		<table border="7" align="center">
			<tr>
				<th>电脑编号</th>
				<th>名称</th>
				<th>内存</th>
				<th>CPU</th>
				<th>显卡</th>
				<th>显示器</th>
				<th>硬盘</th>
				<th>价格</th>
			</tr>
			<s:iterator value="computers" var="c">
				<tr>
					<td>${c.computer_id }</td>
					<td>${c.computer_name }</td>
					<td>${c.cup }</td>
					<td>${c.display }</td>
					<td>${c.hdd }</td>
					<td>${c.memory }</td>
					<td>${c.price }</td>
					<td>${c.videocard }</td>
				</tr>
			</s:iterator>
		</table>
	</form>
</body>
</html>
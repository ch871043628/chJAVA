<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="addcomputeraction" method="post">
		<table style="align-content: center;">
			<h1>电脑</h1>
			<tr>
				<td>电脑名称:</td>
				<td><input type="text" name="computer.computer_name" /></td>
			</tr>
	 <tr>
				<td>内存:</td>
				<td><input type="text" name="computer.memory" /></td>
			</tr> 
			<tr>
				<td>CPU:</td>
				<td><input type="text" name="computer.cup" /></td>
			</tr>
			<tr>
				<td>显卡:</td>
				<td><input type="text" name="computer.videocard" /></td>
			</tr>
			<tr>
				<td>显示器:</td>
				<td><input type="text" name="computer.display" /></td>
			</tr>
			<tr>
				<td>硬盘:</td>
				<td><input type="text" name="computer.hdd" /></td>
			</tr>
			<tr>
				<td>价格:</td>
				<td><input type="text" name="computer.price" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="提交" /></td>
			</tr>
		</table>
	</form>
</body>
</html>
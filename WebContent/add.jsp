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
	<form action="addAction" method="post">
		<table>
			<h1>电脑商城</h1>
			<tr>
				<td>电脑名称:</td>
				<td><input type="text" name="component.componentName" /></td>
			</tr>
	 <tr>
				<td>电脑类型:</td>
				<td><select name="component.componentType.type_id">
				<s:property value="types"/>
						<s:iterator value="types" >
							<option value='<s:property value="type_id"/>'><s:property value="typename"/></option>
						</s:iterator>
				</select></td>
			</tr> 
			<tr>
				<td>电脑容量:</td>
				<td><input type="text" name="component.capacity" /></td>
			</tr>
			<tr>
				<td>电脑价格:</td>
				<td><input type="text" name="component.price" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="提交" /></td>
			</tr>
		</table>
	</form>
</body>
</html>
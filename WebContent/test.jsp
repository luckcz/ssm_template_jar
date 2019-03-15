<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/springmvc/test">
		<select name = "list[0].type">
			<option value="1">小型口径</option>
			<option value="2">中型口径</option>
			<option value="3">大型口径</option>
		</select>
		<input type="text" name = "list[0].count">
		
		<select name = "list[1].type">
			<option value="1">小型口径</option>
			<option value="2">中型口径</option>
			<option value="3">大型口径</option>
		</select>
		<input type="text" name = "list[1].count">
		
		<select name = "list[2].type">
			<option value="1">小型口径</option>
			<option value="2">中型口径</option>
			<option value="3">大型口径</option>
		</select>
		<input type="text" name = "list[2].count">
		
		<input type="submit" value="提交">
	</form>
</body>
</html>
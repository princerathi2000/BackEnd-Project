<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<form action="<%=request.getContextPath()%>/register" method="post">
			Id<input type="text" name="classid"><br>
			Name<input type="text" name="classname">
			<input type="submit" value="Submit">
		</form>
	</div>
</body>
</html>
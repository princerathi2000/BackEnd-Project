<html>
<body>
<h2>Learners Academy</h2>
<%
	String msg=(String)request.getAttribute("msg");
	if(msg!=null)
	{
		out.println(msg);
	}
%>
<a href="classes.jsp">Add Classes</a>
</body>
</html>

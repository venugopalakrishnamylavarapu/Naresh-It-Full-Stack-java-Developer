<html>
<body>
<% 
String submit=request.getParameter("operation");
		if(submit.equals("Addition"))
		{
			%><jsp:forward page="add.jsp"/><%
		}
		else if(submit.equals("Subtraction"))
		{
			%><jsp:forward page="sub.jsp"/><%
		}
		else if(submit.equals("Multiplication"))
		{
			%><jsp:forward page="mul.jsp"/><%
		}
		else
		{
			%><jsp:forward page="div.jsp"/><%
		}
%>
</body>
</html>
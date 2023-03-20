<html>
<body>
<h1>
<%
String s1=request.getParameter("uname");
String s2=request.getParameter("pword");
if(s1.equals("abc") && s2.equals("xyz"))
{
	out.println("Welcome");
}
else
{
	out.println("Invalid Username/Password");
}
%>
</h1>
</body>
</html>
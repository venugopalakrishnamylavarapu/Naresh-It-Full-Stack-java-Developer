<html>
<body bgcolor=yellow text=red>
<h1>
<%
String s1=request.getParameter("fnumber");
String s2=request.getParameter("snumber");
out.println("Output : "+(Integer.parseInt(s1)-Integer.parseInt(s2)));
%>
</h1>
</body>
</html>
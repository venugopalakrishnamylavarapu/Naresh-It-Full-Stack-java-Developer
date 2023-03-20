  <html>
<body bgcolor=red text=yellow>
<h1>
<%@ page errorPage="error.jsp" %>
<%
String s1=request.getParameter("fnumber");
String s2=request.getParameter("snumber");
int x=Integer.parseInt(s1);
int y=Integer.parseInt(s2);
int z=x/y;
out.println("Output : "+z);
%>
</h1>
</body>
</html>
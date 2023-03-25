<%@page import="java.sql.ResultSet"%>
<html>
<body bgcolor=yellow text=red>
<h1>
<% result.ResultBean rb=(result.ResultBean)request.getAttribute("result"); %>
HallTicet Number: <%= rb.getHno() %><br>
Name: <%= rb.getName() %><br>
C: <%= rb.getC() %><br>
C++: <%= rb.getCpp() %><br>
Java: <%= rb.getJava() %><br>
</h1>
</body>
</html>
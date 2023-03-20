<html>
<body>
<h1>
<%@page import="java.util.*" %><!-- if we write session="false" here then session is not created and this html will not compiler -->
Session id: <%=session.getId() %><br>
Created Time: <%=new Date(session.getCreationTime()) %><br>
Last Accessed Time:<%=new Date(session.getLastAccessedTime()) %><br>
</h1>
</body>
</html>
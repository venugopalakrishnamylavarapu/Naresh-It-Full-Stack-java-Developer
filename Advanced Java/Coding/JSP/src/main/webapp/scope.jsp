<html>
<body bgcolor=green text=yellow>
<h1>
<% 
pageContext.setAttribute("platform1","JavaSE",PageContext.PAGE_SCOPE);
pageContext.setAttribute("platform2","JavaEE",PageContext.REQUEST_SCOPE);
pageContext.setAttribute("platform3","JavaME",PageContext.SESSION_SCOPE);pageContext.setAttribute("platform4","JavaFX",PageContext.APPLICATION_SCOPE);
%>
${ pageScope.platform1 }<br>
${ requestScope.platform2 }<br>
${ sessionScope.platform3 }<br>
${ applicationScope.platform4 }<br>
</h1>
</body>
</html>
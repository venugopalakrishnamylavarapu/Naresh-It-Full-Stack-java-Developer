<%-- JSP program to display multiplication table --%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor=green text=yellow>
<table border=1>
<% for(int i=0;i<=10;i++){ %>
<tr>
<td> 9 </td>
<td> x </td>
<td> <%= i %> </td>
<td> = </td>
<td> <%= 9*i %> </td>
</tr>
<% } %>
</table>
</body>
</html>
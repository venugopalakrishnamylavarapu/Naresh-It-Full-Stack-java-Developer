<html>
<head>
<meta charset="ISO-8859-1">
<title>Count JSP</title>
</head>
<body>
<h1>
<%! int count=0; %>
This page has been accessed <%= ++count %> times
</h1>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor=green text=white>
<h1>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="a" value="-10"/>
<c:choose>
<c:when test="${a>0 }">
<c:out value="Positive Number"/>
</c:when>
<c:when test="${a<0}">
<c:out value="Negative Number"/>
</c:when>
<c:otherwise>
<c:out value="zero"/>
</c:otherwise>
</c:choose>
</h1>
</body>
</html>
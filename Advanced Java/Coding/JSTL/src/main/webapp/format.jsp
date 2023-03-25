<html>
<body>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
<c:set var="d" value="<%=new java.util.Date() %>"/>
<fmt:formatDate value="${d }"/><br>
<fmt:formatDate type="date" dateStyle="short" value="${d }"/><br>
<fmt:formatDate type="date" dateStyle="medium" value="${d }"/><br>
<fmt:formatDate type="date" dateStyle="long" value="${d }"/><br>
<fmt:formatDate type="time" timeStyle="short" value="${d }"/><br>
<fmt:formatDate type="time" timeStyle="medium" value="${d }"/><br>
<fmt:formatDate type="time" timeStyle="long" value="${d }"/><br>
<fmt:formatDate type="both" dateStyle="short" value="${d }"/><br>
<fmt:formatDate type="both" dateStyle="medium" value="${d }"/><br>
<fmt:formatDate type="both" dateStyle="long" value="${d }"/><br>
<c:set var="a" value="23424.32543"/>
<fmt:formatNumber value="${a}" maxIntegerDigits="5" maxFractionDigits="2"/><br>
<fmt:formatNumber value="${a}" maxIntegerDigits="5" maxFractionDigits="3" type="cureency" currencySymbol="$"/><br>
</body>
</html>
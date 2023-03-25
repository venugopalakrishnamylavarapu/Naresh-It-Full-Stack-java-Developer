<html>
<body>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="s" value="Welcome to JSTL"/>
Given String:<c:out value="${s}"></c:out>
<c:if test="${fn:contains(s,'JSTL')}">
<c:out value="Yes given string contains JSTL"/>
</c:if><br>
<c:choose>
<c:when test="${fn:contains(s,'jstl'}">
<c:out value="Yes the given string contains JSTL"/>
</c:when>
<c:otherwise>
<c:out value="No the Given string does not contain jstl"/>
</c:otherwise>
</c:choose>

<c:out value="${fn:toLowerCase(s)}"/>
<c:out value="${fn:toUpperCase(s)}"/>
<c:out value="${fn:substring(s,11,4)}"/>
<c:out value="${fn:length(s)}"/>

</body>
</html>
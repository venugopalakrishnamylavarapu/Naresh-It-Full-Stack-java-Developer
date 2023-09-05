<html>
<body>
<table border="2">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<sql:setDataSource var="conn" driver="oracle.jdbc.driver.OracleDriver" url="jdbc:oracle:thin:@localhost:1521:SYSTEM" user="jdbc" password="jdbc"/>
<sql:query var="rs" dataSource="${conn}" sql="select * from student"/>
<c:forEach var="record" items="${rs.rows }">
<tr><td><c:out value="${record.sno }"/></td>
<td><c:out value="${record.sname }"/></td>
<td><c:out value="${record.smarks }"/></td></tr>
</c:forEach>
</table>
</body>
</html>
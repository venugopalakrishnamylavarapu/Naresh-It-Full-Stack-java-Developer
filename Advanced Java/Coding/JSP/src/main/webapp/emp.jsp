<html>
<body bgcolor=red text=yellow>
<h1>
<jsp:useBean id="eb" class="bean2.empBean"/>
<jsp:setProperty name="eb" property="*"/>
Employee Number: <jsp:getProperty name="eb" property="empNo"/><br>
Employee Name :<jsp:getProperty name="eb" property="name"/><br>
Employee Salary:<jsp:getProperty name="eb" property="salary"/><br>
</h1>
</body>
</html>
<html>
<body bgcolor=red text=yellow>
<h1>
<jsp:useBean id="mb" class="bean.MessageBean"/>
<jsp:setProperty name="mb" property="message" value="Welcome to beans"/>
<jsp:getProperty name="mb" property="message"/>
</h1>
</body>
</html>
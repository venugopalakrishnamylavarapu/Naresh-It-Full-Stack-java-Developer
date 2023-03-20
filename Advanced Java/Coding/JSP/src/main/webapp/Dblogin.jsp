<html>
<body>
<h1>
<%!
java.sql.Connection conn;
	public void jspInit()
	{
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn=java.sql.DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SYSTEM","login","login");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
%>
<%
String s1=request.getParameter("uname");
String s2=request.getParameter("pword");
java.sql.PreparedStatement pstmt=conn.prepareStatement("select * from loginfo where uname=? and pword=?");
pstmt.setString(1,s1);
pstmt.setString(2,s2);
java.sql.ResultSet rs=pstmt.executeQuery();
if(rs.next())
{
	out.println("Welcome "+s1);
}
else{
	out.println("Invalid UserName/Password");
}
%>
<%!
public void jspDestroy()
{
	try{
		conn.close();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
%>
</h1>
</body>
</html>
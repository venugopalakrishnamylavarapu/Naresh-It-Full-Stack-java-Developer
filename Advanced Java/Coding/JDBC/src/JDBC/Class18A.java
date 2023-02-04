package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//Batch processing here we dont need ResultSet since we cant write DQL in batch queries
public class Class18A{
	public static void main(String[] args) {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SYSTEM","system","tiger");
		Statement stmt=conn.createStatement();
		stmt.addBatch("insert into test1002 values(15,'sharmila','F')");
		stmt.addBatch("insert into test1002 values(16,'sunil','M')");
		stmt.addBatch("insert into test1002 values(17,'susmitha','F')");
		stmt.addBatch("insert into test1002 values(18,'raghuram','M')");
		stmt.executeBatch();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

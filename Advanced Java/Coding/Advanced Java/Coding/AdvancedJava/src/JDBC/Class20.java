package JDBC;

import javax.sql.rowset.JdbcRowSet;

import oracle.jdbc.rowset.OracleJDBCRowSet;
//JdbcRowSet
public class Class20 {
	public static void main(String[] args) {
		try {
			JdbcRowSet jrs=new OracleJDBCRowSet();
			jrs.setUrl("jdbc:oracle:thin:@localhost:1521:SYSTEM");
			jrs.setUsername("system");
			jrs.setPassword("tiger");
			jrs.setCommand("select * from test1002");
			jrs.execute();
			while(jrs.next())
			{
				System.out.print(jrs.getInt(1)+"\t");
				System.out.print(jrs.getString(2)+"\t\t");
				System.out.println(jrs.getString(3));
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

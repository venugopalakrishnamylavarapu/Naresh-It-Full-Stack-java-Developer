package JDBC;

import javax.sql.rowset.CachedRowSet;

import oracle.jdbc.rowset.OracleCachedRowSet;

//CachedRowSet
public class Class20A {
	public static void main(String[] args) {
		try {
			CachedRowSet crs=new OracleCachedRowSet();
			crs.setUrl("jdbc:oracle:thin:@localhost:1521:SYSTEM");
			crs.setUsername("system");
			crs.setPassword("tiger");
			crs.setCommand("select * from test1002");
			crs.execute();
			while(crs.next())
			{
				System.out.print(crs.getInt(1)+"\t");
				System.out.print(crs.getString(2)+"\t\t");
				System.out.println(crs.getString(3));
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

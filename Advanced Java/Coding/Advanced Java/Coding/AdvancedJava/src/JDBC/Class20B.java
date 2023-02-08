package JDBC;

import java.io.FileOutputStream;

import javax.sql.rowset.WebRowSet;

import oracle.jdbc.rowset.OracleWebRowSet;
//WebRowSet -> mostly it is used to create xml files
public class Class20B {
	public static void main(String[] args) {
		try {
			WebRowSet wrs=new OracleWebRowSet();
			wrs.setUrl("jdbc:oracle:thin:@localhost:1521:SYSTEM");
			wrs.setUsername("system");
			wrs.setPassword("tiger");
			wrs.setCommand("select * from test1002");
			wrs.execute();
			FileOutputStream fos=new FileOutputStream("test1002.xml");
			wrs.writeXml(fos);
			System.out.println("Xml file created");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

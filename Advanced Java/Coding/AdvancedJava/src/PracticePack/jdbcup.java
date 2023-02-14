package PracticePack;
//this is a class that i created on my own and did the programs my self with my own explaination for the future me!!.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;

/*
->Statment(used to execute static Sql queries generally used to execute ddl(it also comes under static) queries)
stmt.execute() -> used to execute any sql query may it be DML(U,I,D),DDL(C,A,R,T,D),DQL(S) but recommended to use it for only DDL queries
stmt.executeUpdate() ->used to execute DML queries(U,I,D)
ResultSet is used to store the data from the DQL query(the table data)
stmt.executeQuery() -> used to execute DQL queried (select query) and its result is stored in result set
->PrepareStatement(used to execute dynamic sql queries) is a onetime compile statement (means we dont need to change the value every time to compile it we can compile it one time and 
  change the values through command line arguments or scanner class every time)
->PreparedStatement contains execute(),executeUpdate(),executeQuery()(this method contains Result set method which is used to view the data present inside the database),
->Callable Statement used to execute plsql queries
*/



public class jdbcup {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SYSTEM","system","tiger");
		System.out.println("Connection Succeded");
		PreparedStatement pstmt=conn.prepareStatement("insert into test1002 values(?,?,?)");
		System.out.println("Enter tno");
		pstmt.setInt(1, sc.nextInt());sc.nextLine();
		System.out.println("Enter tname");
		pstmt.setString(2, sc.nextLine());
		System.out.println("Enter tgender");
		pstmt.setString(3, sc.next());sc.nextLine();
		System.out.println("One record inserted");
		pstmt.executeUpdate();
//		stmt.executeUpdate("insert into student values(4,'sathwika',100)");
//		System.out.println("data inserted into the table");

	//the below code is used to execute the plsql queries 	
//		CallableStatement cstmt=conn.prepareCall("{call insertstu(?,?,?)}");
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the Serial no");
//		cstmt.setInt(1, sc.nextInt());
//		sc.nextLine();
//		System.out.println("Enter the Student Name");
//		cstmt.setString(2, sc.nextLine());
//		System.out.println("Enter the Student Marks");
//		cstmt.setInt(3, sc.nextInt());
//		cstmt.execute();
//		System.out.println("1 Record inserted successfully");		
		
//	//to watch the data in the query use the below process
//		//to store the data came from the DQL query we use ResultSet(which contains some methods to retrive the data).
//		ResultSet rs=stmt.executeQuery("select * from student");
//		//Here metadata is The Column Heading in the table(database) so we used getMetaData() method present in the ResultSet.
//		ResultSetMetaData rsmd=rs.getMetaData();
//		
//		for(int i=1;i<=rsmd.getColumnCount();i++)
//			System.out.print(rsmd.getColumnName(i)+"\t");
//		System.out.println();
//		while(rs.next())
//		{
//			for(int i=1;i<=rsmd.getColumnCount();i++)
//				System.out.print(rs.getString(i)+"\t");
//			System.out.println();
//		}
		
		}catch(SQLException |ClassNotFoundException e)
		{
				e.printStackTrace();
		}
		finally {
			sc.close();
		}
	}
}

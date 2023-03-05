package sListener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {
	Connection conn;
    public void contextInitialized(ServletContextEvent sce)  { 
    	try {
    		Class.forName("oracle.jdbc.driver.OracleDriver");
    		conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SYSTEM","system","tiger");
    		ServletContext sc=sce.getServletContext();
    		sc.setAttribute("oracle", conn);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    public void contextDestroyed(ServletContextEvent sce)  { 
    	try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
	
}
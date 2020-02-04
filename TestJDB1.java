package com.JDBC.test;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDB1 {
	
	private static Connection conn ;
	private static Statement st ;
	
	public static void test() throws SQLException {
		try {
			Class.forName ("org.h2.Driver"); 
			conn = DriverManager.getConnection ("jdbc:h2:~/test", "sa",""); 
			st = conn.createStatement(); 
			
			String sql_query =  "CREATE TABLE   PERSONS " + 
		            "(ID AUTO_INCREMENT INTEGER not NULL, " + 
		            " NAME VARCHAR(150), " +  
		            " AGE INTEGER, " +  
		            " HEIGHT INTEGER, " + 
		            " WEIGHT INTEGER, " + 
		            " SEX VARCHAR(10), " +  
		            " PRIMARY KEY ( ID ))";  
		         st.executeUpdate(sql_query);  
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			 st.close(); 
	         conn.close(); 
		}
		
	}
	

}

//Just a filler file to show this project as java

import java.sql.*;
import javax.sql.*;

public class Main {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/";

	static final String USER = "root";
	static final String PASS = null;	
	
  public static void main(String[] args) {
	
	Connection conn = null;
	Statement stmt = null;
	try {
		Class.forName("com.mysql.jdbc.Driver");

		conn = DriverManager.getConnection(DB_URL, USER, PASS);

		stmt = conn.createStatement();

		String sql = "CREATE DATABASE PREDICTOR";
		stmt.executeUpdate(sql);
	}catch(SQLException se){
		se.printStackTrace();
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		try{
			if(stmt!=null)
				stmt.close();
		}catch(SQLException se2){
		}
		try{
			if(conn!=null)
				conn.close();
		}catch(SQLException se){
			se.printStackTrace();
		}
	}

    System.out.println("Hello World");
  }
}

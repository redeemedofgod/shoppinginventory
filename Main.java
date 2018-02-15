//Just a filler file to show this project as java

import java.sql.*;
import java.lang.*;

public class Main {

  public static void main(String[] args) {

	try {
		
		String username = "user";
		String password = "password";
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", username, password);

		Statement stmt = conn.createStatement();

		ResultSet rs = stmt.executeQuery("select * from inventory");

		while (rs.next()){
			System.out.println(rs.getString("name") + ", " + rs.getString("amount"));
		}

	}catch(SQLException e){
		e.printStackTrace();
	}

  }
}

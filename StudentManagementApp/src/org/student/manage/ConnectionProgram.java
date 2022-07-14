package org.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProgram {
	
	static Connection connection; 
	// not static method
	 static Connection createConnectionprogram() {
		
		
		// Exception -- i would like to check whether the database is loading or not
		try {
			// load the driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Create the connection
			String user = "root";
			String password = "Tushyap1234@";
			String url = "jdbc:mysql://localhost:3306/student_management?autoReconnect=true&useSSL=false";
			connection = DriverManager.getConnection(url,user,password);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

}
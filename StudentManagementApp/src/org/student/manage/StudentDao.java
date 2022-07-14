package org.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class StudentDao {
	
	
	public static boolean insertStudentToDB(StudentModel stdData) {
		boolean f = false;
		try {
		  // JDBC code
			Connection connection = ConnectionProgram.createConnectionprogram();
			String query = "INSERT INTO  student_table (Std_Name, Std_Phone, Std_City) VALUES (?,?,?);";
			
			// prepared statement
			
			PreparedStatement pstmt = connection.prepareStatement(query);
			pstmt.setString(1, stdData.getStudentName());
			pstmt.setString(2, stdData.getStudentPhone());
			pstmt.setString(3, stdData.getStudentCity());
			// execute
			pstmt.executeUpdate();
			f = true;
		}catch(Exception e) {
			
		}return f;
		
	}

}

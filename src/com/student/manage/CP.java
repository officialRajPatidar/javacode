package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
static	Connection con;
	public static Connection createC() {
	try {
		//load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//create the connection
		String user = "root";
		String password = "6264";
		String url = "jdbc:mysql://localhost:3306/student_manage?useSSL=false";
		con = DriverManager.getConnection(url, user, password);
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
		 
	return con;	
	}

}

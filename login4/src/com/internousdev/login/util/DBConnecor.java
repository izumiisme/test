package com.internousdev.login.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnecor {
	private static String driverName = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost/logindb_fujie";

	private static String user = "root";
	private static String password = "mssql";

	public Connaction getConnection(){
	Connection con = null;

	try{
		Class.forName(driverName);
		con = (Connection) DriverManager.getConnection(url,user,password);

	}catch(ClassnotFoundException e){
		e.printStackTrace();

	}catch(SQLException e)

	}
}

package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnectionInLegacyWay {

	public static void main(String[] args)   {
		try  {
		Class.forName("com.mysql");
		Connection conn = DriverManager.getConnection("ur","username","password");
		PreparedStatement stmt = conn.prepareStatement(null);
//		Statement stmt = conn.createStatement();
//		Calla
		}catch(ClassNotFoundException  | SQLException ex) {
			System.out.println(ex);
		}
	
	}
}

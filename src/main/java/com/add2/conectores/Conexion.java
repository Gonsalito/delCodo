package com.add2.conectores;

import java.sql.*;

public class Conexion {

	public static void main (String args[]) {
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tabala_prueba", "root", "root");
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(" select * from personas");
			
			while (rs.next())
				System.out
					.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt (4));
			con.close();
	
		}catch(SQLException e) {
			
			System.out.println(e);			
		}
	}
}

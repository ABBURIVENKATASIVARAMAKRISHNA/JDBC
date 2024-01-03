package com.jsp.MyDb;

import java.sql.*;


public class App 
{
	public static void main( String[] args )
	{
		//My DATA BASE Connected
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");


			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Siva@1998");

			PreparedStatement pstmt=con.prepareStatement("select * from employee");
			ResultSet res=pstmt.executeQuery();

			while(res.next())
			{
				System.out.println(res.getInt("EMPNO")+" "+res.getString("ENAME")+" "+res.getString("JOB")+" "+res.getString("MGR"));
			}
			con.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}			

	}
}

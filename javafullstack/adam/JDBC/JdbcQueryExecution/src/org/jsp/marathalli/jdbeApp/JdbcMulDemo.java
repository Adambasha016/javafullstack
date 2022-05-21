package org.jsp.marathalli.jdbeApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcMulDemo 
{
	public static void main(String[] args) 
	{
		Connection con=null;
		Statement stmt=null;

		String inQString7 ="insert into jspider.Student values (9,'chandhu','mech',85.97)";
		String inQString8 ="insert into jspider.Student values (10,'ben10','ece',75.97)";
		String inQString9 ="insert into jspider.Student values (11,'markas','all',00.00)";
		String inQString4 ="insert into jspider.Student values (6,'chandhu','mech',85.97)";
		String inQString5 ="insert into jspider.Student values (7,'ben10','ece',75.97)";
		String inQString6 ="insert into jspider.Student values (8,'markas','all',00.00)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=mohan");
			stmt=con.createStatement();
			stmt.executeUpdate(inQString7); //compilation&execution
			stmt.executeUpdate(inQString8); //compilation&execution
			stmt.executeUpdate(inQString9); //compilation&execution
			stmt.executeUpdate(inQString4); //compilation&execution
			stmt.executeUpdate(inQString5); //compilation&execution
			stmt.executeUpdate(inQString6); //compilation&execution
          		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			if(stmt!=null)
			{
				try 
				{
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				if(con!=null)
				{
					try {
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				System.out.println("costely resoures arer closed");
			}

		}
		
	}

}

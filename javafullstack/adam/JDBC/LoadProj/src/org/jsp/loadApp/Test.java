package org.jsp.loadApp;


public class Test {

	public static void main(String[] args)
	{
		try
		{
			Class.forName("org.jsp.loadApp.Student");
		} 
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}

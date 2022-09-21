package com.product.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionManagerImpl implements ConnectionManager{

	@Override
	public Connection getConnection() {
		// TODO Auto-generated method stub
		Connection connection=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mytrgdb","root","");
			
		}
		catch(ClassNotFoundException | SQLException ex)
		{
			ex.printStackTrace();
		}
		return connection;
	}
	
	
}

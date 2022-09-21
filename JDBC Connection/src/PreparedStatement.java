import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PreparedStatement {
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mytrgdb","root","");
			System.out.println("Connected To Database");	
			String query="insert into products values(?,?,?);";
			java.sql.PreparedStatement preparedStatement=con.prepareStatement(query);
			preparedStatement.setInt(1,110);
			preparedStatement.setString(2,"Ansul");
			preparedStatement.setInt(3,500);
			
			int val=preparedStatement.executeUpdate();
			if(val>0)
				System.out.println("Record Inserted");
			else
				System.out.println("Record not Inserted");
		}
		catch(ClassNotFoundException | SQLException ex)
		{
			ex.printStackTrace();
		}
	}
}

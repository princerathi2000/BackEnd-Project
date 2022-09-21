import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class JdbcConnect {

	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mytrgdb","root","");
			System.out.println("Connected To Database");
			Statement stmt=con.createStatement();
//			String query="insert into products values(1,'Afresh',744);";
//			int val=stmt.executeUpdate(query);
//			if(val>0)
//				System.out.println("Record Inserted");
//			else
//				System.out.println("record not inserted");
//			
//			String query="update products set product_name='Afresh Energy Drink' where product_id=1;";
//			int val=stmt.executeUpdate(query);
//			if(val>0)
//				System.out.println("Record Inserted");
//			else
//				System.out.println("record not inserted");
//			
//			String query="update products set product_name='Afresh Energy Drink' where product_id=1;";
//			int val=stmt.executeUpdate(query);
//			if(val>0)
//				System.out.println("Record Updated");
//			else
//				System.out.println("Record not Updated");
			
			String query="delete from products where product_id=1;";
			int val=stmt.executeUpdate(query);
			if(val>0)
				System.out.println("Record Deleted");
			else
				System.out.println("Record not Deleted");
		}
		catch(ClassNotFoundException | SQLException ex)
		{
			ex.printStackTrace();
		}
	}
}

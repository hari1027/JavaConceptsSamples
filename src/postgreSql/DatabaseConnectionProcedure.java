package postgreSql;
import java.sql.*;

public class DatabaseConnectionProcedure {
	
		public static Connection getDB()
		{
			Connection con=null;
			try
			{
				con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/","postgres","postgres");
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}
			return con;
		}
}



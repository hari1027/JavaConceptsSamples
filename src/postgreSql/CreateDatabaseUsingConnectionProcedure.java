package postgreSql;
import java.sql.*;

public class CreateDatabaseUsingConnectionProcedure {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		con=DatabaseConnectionProcedure.getDB();
		
		try
		{
			st=con.createStatement();
			String sql="create database student";
			st.executeUpdate(sql);
			st.close();
			con.close();
			System.out.println("Database created sucessfully");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}

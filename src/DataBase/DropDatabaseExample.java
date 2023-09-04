package DataBase;
import java.sql.*;

public class DropDatabaseExample {
	static final String Driver ="com.mysql.jdbc.Driver";
	static final String url ="jdbc:mysql://localhost:3306";
	static final String user="root";
	static final String pass="root";
	

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		try
		{   Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection (url,user,pass);
			st=con.createStatement();
			String sql="create database student1";
			st.executeUpdate(sql);
			System.out.println("sucessfully DataBase created");
			String sql1="Drop Database student1";
			st.executeUpdate(sql1);
			System.out.println("sucessfully Droped Database");
		}
		
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(st!=null)
					st.close();
			}
			catch(SQLException se)
			{
				
			}
			try
			{
				if(con!=null)
					con.close();
			}
			catch (SQLException e)
			{
				
			}
		}

	}

}


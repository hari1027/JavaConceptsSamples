package DataBase;

import java.sql.*;

public class DropTableExample {
	static final String Driver ="com.mysql.jdbc.Driver";
	static final String url ="jdbc:mysql://localhost:3306/student" ;
	static final String user="root";
	static final String pass="root";

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,user,pass);
			st=con.createStatement();
			String sql= "Drop table register";
			st.executeUpdate(sql);
			System.out.println("droped table sucessfully");
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


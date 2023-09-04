package DataBase;

import java.sql.*;

public class SelectRecordsExample {
	static final String Driver ="com.mysql.jdbc.Driver";
	static final String url ="jdbc:mysql://localhost:3306/student";
	static final String user="root";
	static final String pass="root";

	public static void main(String[] args) {
		Connection con=null;
	    Statement st=null;
	    try
	    {

	    	 Class.forName("com.mysql.jdbc.Driver");
	         con=DriverManager.getConnection (url,user,pass);
		     st=con.createStatement();
		     String sql = "select id,name,age,address,email from register";
		     ResultSet rs = st.executeQuery(sql);
		     
		     while(rs.next())//used to print result in console
		     {
		    	 int id = rs.getInt("id");
		    	 String n = rs.getString("name");
		    	 int age = rs.getInt("age");
		    	 String add = rs.getString("address");
		    	 String email = rs.getString("email");
		    	 
		    	 System.out.println("student_id " + id);
		    	 System.out.println("student name " + n);
		    	 System.out.println("student age " + age );
		    	 System.out.println("student address " + add);
		    	 System.out.println("student email " + email);
		    	 
		    	 
		     }
		     rs.close();
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

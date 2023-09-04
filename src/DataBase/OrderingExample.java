package DataBase;

import java.sql.*;

public class OrderingExample 
{
	static final String Driver ="com.mysql.jdbc.Driver";
	static final String url ="jdbc:mysql://localhost:3306/scorecard";
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
		     String sql = "Select * from battingcard "+" ORDER BY RunScored DESC"; // for accending orde ASC
		     ResultSet rs= st.executeQuery(sql);
		     System.out.println("ordering done sucessfully");
		     
		     while(rs.next())
		     {
		    	// int Number = rs.getInt("Number");
		    	 //String Type = rs.getString("Type");
		    	 String Name = rs.getString("Name");
		    	 int RunsScored = rs.getInt("RunScored");
		    	 //int BallFaced= rs.getInt("BallFaced");
		    	 //String OutType = rs.getString("OutType");
		    	 
		    	 //System.out.println("number is :" + Number);
		    	 //System.out.println("Type of batsman is :" + Type);
		    	 System.out.println("Name of the batsman is :" + Name);
		    	 System.out.println("runs scored is :" + RunsScored);
		    	 //System.out.println("ballsFaced is :" + BallFaced);
		    	 //System.out.println("fall of wicket by :" + OutType);
		    	 System.out.println();
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

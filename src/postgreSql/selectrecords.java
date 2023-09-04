package postgreSql;

import java.sql.*;

public class selectrecords {
	static final String driver ="org.postgresql.Driver";
	static final String url="jdbc:postgresql://localhost:5432/hari";
	static final String user="postgres";
	static final String pass="postgres";


	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		try
		{
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection(url,user,pass);
			st=con.createStatement();
			String sql= "select employeeid,name,Age,Email,salary from employee";
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next())
			{
				 int id = rs.getInt("employeeid");
		    	 String n = rs.getString("name");
		    	 int age = rs.getInt("Age");
		         String email = rs.getString("Email");
		         int salary =rs.getInt("salary");
		         
		         System.out.println(id+" "+n+" "+age+ " "+email+" "+salary);
			}
			rs.close();
			System.out.println("selection done sucessfully");

	   }
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}


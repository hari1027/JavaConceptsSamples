package postgreSql;
import java.sql.*;

public class OrderingExample {
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
		  String sql ="select * from employee "+" ORDER BY salary ASC";
		  ResultSet rs = st.executeQuery(sql);
		  
		  while(rs.next())
		  {
			  String name = rs.getString("name");
			  int salary = rs.getInt("salary");
			  
			  System.out.println("employee name " + name +" employee salary " +salary);
			  System.out.println();
		  }
		  
		  System.out.println("ordering done sucessufully");
		  st.close();
		  con.close();
		}
			
			catch(Exception e)
			{
				e.printStackTrace();
			}

			
		}

	}



package postgreSql;
import java.sql.*;

public class UpdateRecordsExample {
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
		 String sql = "Update employee "+" Set salary=20000 where employeeid=1";
		 String sql1="Update employee "+" Set Age=21 where employeeid in(2,3)";
		 st.executeUpdate(sql);
		 st.executeUpdate(sql1);
		 System.out.println("update done sucessfully");
		 st.close();
		 con.close();
	   }
		catch(Exception e)
		{
			e.printStackTrace();
		}


	}

}

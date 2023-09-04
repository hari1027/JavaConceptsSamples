package postgreSql;
import java.sql.*;

public class DropDatabaseExample {
	static final String driver ="org.postgresql.Driver";
	static final String url="jdbc:postgresql://localhost:5432/";
	static final String user="postgres";
	static final String pass="postgres";


	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		try
		{
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection(url,user,pass);
			st= con.createStatement();
			String sql1="create database tcs";
			String sql="drop database tcs";
			st.executeUpdate(sql1);
			st.executeUpdate(sql);
			st.close();
			con.close();
			System.out.println("droped database sucessfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}

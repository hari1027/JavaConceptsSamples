package postgreSql;

import java.sql.*;

public class InsertRecordsExample {
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
			String sql1 = "insert into employee "+" values(1,'Hariharan',20,'a@gmail.com')";
			String sql2 = "insert into employee "+" values(2,'archana',21,'b@gmail.com',40000)";
			String sql3 = "insert into employee "+" values(3,'ram',22,'c@gmail.com',50000)";
			String sql4 = "insert into employee "+" values(4,'suvetha',20,'d@gmail.com',60000)";
			st.executeUpdate(sql1);
			st.executeUpdate(sql2);
			st.executeUpdate(sql3);
			st.executeUpdate(sql4);
			st.close();
			con.close();
			System.out.println("inserted values in table sucessfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}

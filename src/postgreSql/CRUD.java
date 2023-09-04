package postgreSql;

import java.sql.*;

public class CRUD 
  {
	static final String driver ="org.postgresql.Driver";
	static String url="jdbc:postgresql://localhost:5432/";
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
			String sql1 = "create Database scorecard";
			st.executeUpdate(sql1);
			System.out.println("Database sucessfully created");
			
			url = "jdbc:postgresql://localhost:5432/scorecard";//(here we are using the database scorecard after database creation in the same code)
			con=DriverManager.getConnection(url,user,pass);
			st=con.createStatement();
			
			String sql2 = "create table battingcard "+" (Number integer not null,"+"Type varchar(30),"+"Name varchar(50),"+"RunScored integer,"+"BallFaced integer,"+"OutType varchar(30))";
            st.executeUpdate(sql2);
            System.out.println("table created sucessfully");
            
            String sql3 = "insert into battingcard "+" values(1,'opener','Rohit sharma',78,156,'lbw')";
            String sql4 = "insert into battingcard "+" values(2,'opener','kl rahul',32,97,'caught')";
            String sql5 = "insert into battingcard "+" values(3,'middle order batsman','virat kohli',132,245,'bowled')";
            String sql6 = "insert into battingcard "+" values(4,'middle order batsman','shreyas iyer',21,30,'bowled')";
            String sql7 = "insert into battingcard "+" values(5,'middle order batsman','rahanae',61,102,'lbw')";
            String sql8 = "insert into battingcard "+" values(6,'wicket keeper','rishab pant',92,70,'caught')";
            String sql9 = "insert into battingcard "+" values(7,'allrounder','ravindra jadaja',56,100,'bowled')";
            String sql10 = "insert into battingcard "+" values(8,'allrounder','ravi ashwin',21,30,'catch')";
            String sql11 = "insert into battingcard "+" values(9,'bowler','shardul thakur',40,31,'catch')";
            String sql12 = "insert into battingcard "+" values(10,'bowler','shami',4,10,'not out')";
            String sql13 = "insert into battingcard "+" values(11,'bowler','bumrah',2,8,'lbw')";
            
            st.executeUpdate(sql3);
            st.executeUpdate(sql4);
            st.executeUpdate(sql5);
            st.executeUpdate(sql6);
            st.executeUpdate(sql7);
            st.executeUpdate(sql8);
            st.executeUpdate(sql9);
            st.executeUpdate(sql10);
            st.executeUpdate(sql11);
            st.executeUpdate(sql12);
            st.executeUpdate(sql13);
            System.out.println("inserted values sucessfully");
            
            String sql14 = "Update battingcard "+" set Name='pujara' where Number=5 ";
            String sql15 = "Update battingcard "+" set RunScored=50 where Name='shardul thakur'";
            st.executeUpdate(sql14);
            st.executeUpdate(sql15);
            System.out.println("updated values sucessfully");
            System.out.println();
            
            String sql16 = "select Name,RunScored from battingcard";
            ResultSet s = st.executeQuery(sql16);
            
            while(s.next())
            {
            	String name =s.getString("Name");
            	int RunScored =s.getInt("RunScored");
            
            System.out.println("Name of the batsman :" + name +  " runsScored :" + RunScored);
            }
            System.out.println();
            System.out.println("Displaying particular data has been done sucessfully");
            
            String sql17 =" delete from battingcard "+" where Number in(10,11)";
            st.executeUpdate(sql17);
            System.out.println("deletion done sucessfully");
            
		}
		 catch(SQLException se)
		{
			se.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		}
     }


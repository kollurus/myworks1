package LoginD;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database 
{
	String s="";
	  public String isValidUser(String uname,String pswd)
	  {
		  try{
			  Class.forName("oracle.jdbc.driver.OracleDriver");
			  Connection con = DriverManager.getConnection("jdbc:oracle:thin:hr/hr@localhost:1521:orcl");
			  Statement st = con.createStatement();
			  System.out.println("connection establised successfully!");
			  //st.execute("select * from table1");
			  ResultSet rs=st.executeQuery("select * from table1");
			  System.out.println(rs.getString(1)+rs.getString(2));
		  }
		  catch(Exception e)
		  {
			  System.out.println("e");
		  }
		  return s;
	  }
	 
	

}

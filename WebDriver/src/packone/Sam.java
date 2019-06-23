package packone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Sam {

	public static void main(String[] args) throws Exception{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","kishore1","kishore");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select city from Table11");
		//System.out.println("sno   sname  smarks");

		while(rs.next())
		{
			//System.out.println(rs.getInt(1) + "-" + rs.getString(2) + "-" + rs.getString(3));
			System.out.println(rs.getString(1));
		}

	}

}

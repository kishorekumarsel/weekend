package packone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DBCon {

	public static void main(String[] args) throws Exception{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","kkumar1","kishore");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from Data1");
		//System.out.println("sno   sname  smarks");

		while(rs.next())
		{
			WebDriver driver=new FirefoxDriver();
			driver.get("http://facebook.com");
			driver.manage().window().maximize();
			
			driver.findElement(By.id("email")).sendKeys(rs.getString("UID1"));
			driver.findElement(By.id("pass")).sendKeys(rs.getString("PWD"));
			driver.close();
			/*//System.out.println(rs.getString(1));
			System.out.println(rs.getString("EmpName") + "-" + rs.getInt("EmpID") + "-" + rs.getInt("EmpSalary"));
			//System.out.println(rs.getInt(1) + "-" + rs.getString(2) + "-" + rs.getInt(3));
*/		}



	}

}

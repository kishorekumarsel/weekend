package packone;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertsss {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		// Clicking On Go Button
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		// Importing Alert
		Alert a=driver.switchTo().alert();
		Thread.sleep(5000);
		System.out.println(a.getText());
		a.dismiss();
		a.accept();
		
		

	}

}

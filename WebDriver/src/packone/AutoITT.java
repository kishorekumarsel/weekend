package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoITT {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://transfer.pcloud.com/");
		driver.manage().window().maximize();
		
		// CLicking On Image
		driver.findElement(By.xpath("//img[@src='//pcdn-transfer.pcloud.com/Zeb/img/add_files_ico.png']")).click();
		// Executing AutoIT exe file
		Runtime.getRuntime().exec("C:\\Users\\DELL\\Desktop\\WDWeekend\\0525.exe");
		
		

	}

}

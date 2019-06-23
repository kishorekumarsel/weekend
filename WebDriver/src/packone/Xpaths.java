package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpaths {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.bharatmatrimony.com/");
		driver.manage().window().maximize();
		
		WebElement pf=driver.findElement(By.id("REGISTERED_BY"));
		Select s=new Select(pf);
		
		//s.selectByIndex(7);
		
		s.selectByVisibleText("Son");
		
	//driver.findElement(By.xpath("html/body/div[3]/ul/li[3]/a")).click();
		
		
	}

}

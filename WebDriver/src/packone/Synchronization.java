package packone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		// Clicking On RediffMail
		driver.findElement(By.xpath("//a[@href='https://mail.rediff.com/cgi-bin/login.cgi']")).click();
		//Importing Webdriverwait class
		WebDriverWait ww=new WebDriverWait(driver, 30);
		
		ww.until(ExpectedConditions.urlContains("login"));		
		//Entering Username
		driver.findElement(By.id("login1")).sendKeys("Kishore");
		ww.until(ExpectedConditions.numberOfElementsToBe(By.tagName("a"), 6));
		ww.until(ExpectedConditions.elementToBeClickable(By.id("OK")));
		
		driver.findElement(By.id("password")).sendKeys("abcdef");
		
		
		
		

	}

}

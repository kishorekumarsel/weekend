package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsss {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Actions a=new Actions(driver);
		WebElement email=driver.findElement(By.id("email"));
		
		a.contextClick(email).build().perform();
		
		for(int i=1; i<5; i++){
		a.sendKeys(Keys.DOWN).build().perform();
		}
		a.sendKeys(Keys.ENTER).build().perform();
		
		
		/*WebElement button=driver.findElement(By.id("asassd"));
		a.doubleClick(button).build().perform();
		
		a.dragAndDrop(button, button).build().perform();
		*/
		
		
		
		
		/*a.sendKeys(Keys.F5).build().perform();
		a.sendKeys(Keys.CONTROL+"t").build().perform();*/
		
		
		
		/*// Creating Webelement for Companies
		WebElement com=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]/a/div"));
		// Importing Actions
		
		// Moving cursor to Companies
		a.moveToElement(com).build().perform();
		
		// CLicking On About companies under Companies Menu
		driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]/div/ul/li[2]/a")).click();*/

	}

}

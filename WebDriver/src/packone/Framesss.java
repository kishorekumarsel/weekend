package packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Framesss {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		
		//driver.findElement(By.name("name247eab0e")).sendKeys("abcdef");
		driver.findElement(By.xpath("//input[starts-with(@name,'name')]")).sendKeys("Kishore");
		
		/*List<WebElement> frames=driver.findElements(By.tagName("frame"));
		//System.out.println(frames.size());
		int i;
		for(i=0; i<frames.size(); i++){
			List<WebElement> links=driver.switchTo().frame(i).findElements(By.tagName("a"));
			System.out.println(links.size());
			driver.switchTo().parentFrame();
		}*/
		
		/*WebElement f1=driver.findElement(By.name("packageListFrame"));
		WebElement f2=driver.findElement(By.name("packageFrame"));
		driver.switchTo().frame(f1).findElement(By.xpath("//a[@href='java/applet/package-frame.html']")).click();
		driver.switchTo().parentFrame();
		driver.switchTo().frame(f2).findElement(By.xpath("//a[@href='AudioClip.html']")).click();*/
		// Clicking on Link
		//driver.findElement(By.xpath("//a[@href='java/applet/package-frame.html']")).click();
		

	}

}

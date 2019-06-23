package packone;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		// Clicking On Data Policy Link
		driver.findElement(By.id("privacy-link")).click();
		// Counting Number Of Windows
		Set<String> windows=driver.getWindowHandles();
		System.out.println(windows.size());
		//driver.close();
		
		ArrayList a=new ArrayList(windows);
		
		int i;
		for(i=0; i<a.size(); i++){
			System.out.println(driver.switchTo().window((String)a.get(i)).getTitle());
			List<WebElement> links=driver.switchTo().window((String)a.get(i)).findElements(By.tagName("a"));
			System.out.println(links.size());
			driver.close();
		}
		
		//System.out.println(driver.getWindowHandle());
	}
}

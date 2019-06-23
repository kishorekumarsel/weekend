package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BO {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\WDWeekend\\Jars\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.get("http://facebook.com");
		driver1.manage().window().maximize();
		
		driver1.findElement(By.id("email")).sendKeys("Kishore");
		boolean a=driver1.findElement(By.id("pass")).isDisplayed();
		if(a==true)
			System.out.println("Pass");
		else
			System.out.println("fail");
		
		boolean b=driver1.findElement(By.id("pass")).isEnabled();
		if(b==true)
			System.out.println("Pass");
		else
			System.out.println("Fauil");
		
		WebElement pwd=driver1.findElement(By.id("pass"));
		pwd.sendKeys("jhjkl");
		pwd.clear();
		
		boolean c=pwd.isDisplayed();
		
			
		
		
		
		driver1.findElement(By.id("pass")).sendKeys("abcdef");
		driver1.findElement(By.id("day")).sendKeys("24");
		driver1.findElement(By.id("month")).sendKeys("Apr");
		driver1.findElement(By.id("email")).clear();
		driver1.findElement(By.id("u_0_a")).click();
		
		
		
		

	}

}

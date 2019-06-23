package packone;

import java.awt.Rectangle;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class R {

	public static void main(String[] args) throws Exception{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		Rectangle rec=new Rectangle(35, 45, 600, 50);
		Robot r=new Robot();
		r.createScreenCapture(rec);

	}

}

package packone;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screens {

	public static void main(String[] args) throws Exception{
		
		Methods m=new Methods();
		m.launchApp("http://rediff.com", "C:\\Users\\DELL\\Desktop\\WDWeekend\\rediff.png");
		m.launchApp("http://bharatmatrimony.com", "C:\\Users\\DELL\\Desktop\\WDWeekend\\bm.png");
		
		
		/*WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\DELL\\Desktop\\WDWeekend\\fb.png"));*/

	}

}

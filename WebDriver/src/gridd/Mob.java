package gridd;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Mob {
	  public static final String USERNAME = "sumit421";
	  public static final String AUTOMATE_KEY = "bscdPUA5Y3zW94ybSiKi";
	  public static final String URL1 = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	  public static void main(String[] args) throws Exception {

	    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("browserName", "iPhone");
	    caps.setCapability("device", "iPhone 8 Plus");
	    caps.setCapability("realMobile", "true");
	    caps.setCapability("os_version", "11");
	    caps.setCapability("name", "Bstack-[Java] Sample Test");

	    WebDriver driver = new RemoteWebDriver(new URL(URL1), caps);
	    driver.get("http://www.google.com");
	    WebElement element = driver.findElement(By.name("q"));

	    element.sendKeys("BrowserStack");
	    element.submit();

	    System.out.println(driver.getTitle());
	    driver.quit();

	  }

}

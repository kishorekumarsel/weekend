package testnggg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DP {
	public WebDriver driver;	
	  @DataProvider(name="DP1")
	  public Object[][] object1(){
		  Object[][] obj=new Object[3][2];
		  obj[0][0]="abcdef";
		  obj[0][1]="xyz1234";
		  obj[1][0]="Kishore";
		  obj[1][1]="Qshore";
		  obj[2][0]="Qshore";
		  obj[2][1]="KishoreKumar";
		  return obj;	  }
	  @Test(dataProvider="DP1")
	  public void f(String uid, String pwd) {
		  driver.findElement(By.id("email")).sendKeys(uid);
		  driver.findElement(By.id("pass")).sendKeys(pwd);		  }
	  @BeforeMethod
	  public void beforeMethod() {
		  driver=new FirefoxDriver();
		  driver.get("http://facebook.com");
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
	  }

	  @AfterMethod
	  public void afterMethod() {
		  driver.close();
	  }
}

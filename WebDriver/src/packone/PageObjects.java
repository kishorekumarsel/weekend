package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjects {
	
	/*By uid=By.id("email");
	By pwd=By.id("pass");
	By day=By.id("day");*/
	
	@FindBy(id="email") WebElement uid;
	@FindBy(id="pass") WebElement pwd;
	@FindBy(id="day") WebElement day;
	
	

}

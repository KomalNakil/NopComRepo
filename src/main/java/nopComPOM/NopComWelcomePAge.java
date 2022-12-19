package nopComPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import nopComUtility.nopComUtility;

public class NopComWelcomePAge {

	@FindBy(xpath = "//a[text()='Log in']") private WebElement loginButton;
	
	public NopComWelcomePAge(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLoginButton(WebDriver driver)
	{
		//Reporter.log("Clicking on Login button");
		nopComUtility.waitTime(driver, 1000);
		loginButton.click();
		nopComUtility.waitTime(driver, 1000);
	}
	
}

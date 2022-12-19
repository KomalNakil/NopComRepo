package nopComPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import nopComUtility.nopComUtility;

public class NopComMyAccoutPage {

	@FindBy(xpath= "//input[@id='FirstName']") private WebElement Fname;
	@FindBy(xpath = "//a[@class='ico-logout']") private WebElement logoutButton;
	
	public NopComMyAccoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getFirstName()
	{
		String ActualuserName = Fname.getText();
		return ActualuserName;
	}
	
	public void clickOnLogoutButton(WebDriver driver)
	{
		nopComUtility.waitTime(driver, 1000);
		//Reporter.log("Logging out from app", true);
		logoutButton.click();
		nopComUtility.waitTime(driver, 1000);
	}
}

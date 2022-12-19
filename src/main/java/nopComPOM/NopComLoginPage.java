package nopComPOM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import nopComUtility.nopComUtility;

public class NopComLoginPage {
	@FindBy(xpath = "//input[@class='email']") private WebElement email;
	@FindBy(xpath = "//input[@class='password']") private WebElement pw;
	@FindBy (xpath = "(//button[@type='submit'])[2]") private WebElement loginButton;
	
	public NopComLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendEmail() throws IOException
	{
		//Reporter.log("sending email",true);
		email.sendKeys(nopComUtility.readDataFromProperty("email"));
	}
	
	public void sendPassword() throws IOException
	{
		//Reporter.log("sending password", true);
		pw.sendKeys(nopComUtility.readDataFromProperty("password"));
	}
	
	public void clickOnLoginButton(WebDriver driver)
	{
		//Reporter.log("Clicking on login button", true);
		loginButton.click();
		nopComUtility.waitTime(driver, 1000);
	}

}

package nopComPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import nopComUtility.nopComUtility;


//added comments..
//hjj
//nnmnnn
public class NopComHomePage {
	@FindBy(xpath="//a[@class='ico-account']") private WebElement myAccoutTab;
	
	public NopComHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnmyAccountTab(WebDriver driver)
	{
		
		nopComUtility.waitTime(driver, 1000);
		myAccoutTab.click();
		//Reporter.log("Clicking on myAccout tab" , true);
		nopComUtility.waitTime(driver, 1000);
	}

}

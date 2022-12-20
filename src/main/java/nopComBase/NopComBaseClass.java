package nopComBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import nopComUtility.nopComUtility;

public class NopComBaseClass {
	protected WebDriver driver;
	
	public void launchNopCommerce() throws IOException
	{
		//This is Base Class-- just adding comment
		//added cmt in github
		//....
		
		System.setProperty("webdriver.chrome.driver", "C:\\Testing Project\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(nopComUtility.readDataFromProperty("url"));
		driver.manage().window().maximize();
		//Reporter.log("LAunching NopCommerce", true);
		nopComUtility.waitTime(driver, 1000);
	}
	
	public void closeNopCommerce()
	{
		//Reporter.log("Closing NopCommerce", true);
		nopComUtility.waitTime(driver, 1000);
		driver.close();
		
		//added this comment for nopcomb2
		
	}

}

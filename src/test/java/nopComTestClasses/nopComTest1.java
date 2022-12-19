package nopComTestClasses;



import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import nopComBase.NopComBaseClass;
import nopComPOM.NopComHomePage;
import nopComPOM.NopComLoginPage;
import nopComPOM.NopComMyAccoutPage;
import nopComUtility.nopComUtility;

public class nopComTest1 extends NopComBaseClass {
	

	//NopComWelcomePAge welcome;
	NopComLoginPage login;
	NopComMyAccoutPage myact;
	NopComHomePage home;
	
	@BeforeClass
	public void launchapp() throws IOException
	{
		//welcome = new NopComWelcomePAge(driver);
		
		launchNopCommerce();
		
		login = new NopComLoginPage(driver);
		home = new NopComHomePage(driver);
		myact = new NopComMyAccoutPage(driver);
	}
	
	@BeforeMethod
	public void loginpage() throws InterruptedException, IOException {
		Thread.sleep(1000);
		//welcome.clickOnLoginButton(driver);
		login.sendEmail();
		nopComUtility.waitTime(driver, 1000);
		login.sendPassword();
		nopComUtility.waitTime(driver, 1000);
		login.clickOnLoginButton(driver);
		nopComUtility.waitTime(driver, 1000);
		home.clickOnmyAccountTab(driver);
		nopComUtility.waitTime(driver, 1000);
		
		
		
	}
  @Test
  public void validateFirstname() throws IOException {
	  Reporter.log("Validating firstname", true);
	  System.out.println(myact.getFirstName());
	  Assert.assertEquals(myact.getFirstName(), "Komal", "TC failed ,Firstname not matching" );
	  nopComUtility.ss(driver, myact.getFirstName());
	  nopComUtility.waitTime(driver, 1000);
	  
	   }
  
  @AfterMethod
  public void closingApp()
  {
	  myact.clickOnLogoutButton(driver);
  }
  
  @AfterClass
  public void closingBrowser()
  {
	  closeNopCommerce();
  }
}

package MavenProject.MavenTest.homepage;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;



import MavenProject.MavenTest.testBase.TestBase;
import MavenProject.MavenTest.uiActions.HomePage;

public class TC001_VerifyLoginWithInvalidCredentials extends TestBase {
	 
	HomePage home;
	
	public static final Logger log =Logger.getLogger(TC001_VerifyLoginWithInvalidCredentials.class.getName());
	@BeforeMethod
	public void setUp() throws IOException
	{
		initDriver();
	}
	@Test
	public void VerifyLoginWithInvalidCredentials() 
	{
		
		log.info("===========starting TC001_VerifyLoginWithInvalidCredentials Test=========== ");
		home=new HomePage(driver);
		home.logintoApplication("test@gmail.com", "testany");
		Assert.assertEquals(home.getInvalidLoginText(), "Authentication failed.");		
		log.info("=========ending TC001_VerifyLoginWithInvalidCredentials Test================== ");
	}
	@AfterMethod
	public void endTest()
	{
	driver.close();	
		
	}
		

}

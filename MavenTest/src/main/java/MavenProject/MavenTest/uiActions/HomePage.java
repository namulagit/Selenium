package MavenProject.MavenTest.uiActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	
	@FindBy(xpath="//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	public WebElement signIN;	
	
	@FindBy(xpath="//*[@id='email']")
	public WebElement loginEmailAddress;
	
	@FindBy(xpath="//*[@id='passwd']")
	public WebElement loginPassword;
	@FindBy(xpath="//*[@id='SubmitLogin']/span")
	public WebElement LoginSubmit; 
	@FindBy(xpath="//*[@id='center_column']/div[1]/ol/li")
	public WebElement authenticationFailed;
	
	public HomePage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void logintoApplication(String email,String password)
	{
		signIN.click();
		loginEmailAddress.sendKeys(email);
		loginPassword.sendKeys(password);
		LoginSubmit.click();
		
	}
	public String getInvalidLoginText()
	{
		
		return  authenticationFailed.getText();
	}
	

}

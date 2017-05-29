package com.selendemo;

import org.openqa.selenium.WebDriver;

public class LoginPageActions {
	WebDriver webdriver;
	LoginPage lp;
	
	LoginPageActions(WebDriver driver)
	{
		webdriver=driver;
		 lp=new LoginPage(webdriver);
		
	}
	
	
	public void typeUsername()
	{
		
		lp.EmailID().sendKeys("username");
		
	}
	public void typePassword()
	{
		
		
		lp.PassWord().sendKeys("password");
	}
	public void clickSignin()
	{
		
		lp.SignIn().click();
	}
	

}

package com.selendemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver webdriver; 
	public LoginPage(WebDriver driver)
	{
		webdriver=driver;
		
	}

	
	public  WebElement EmailID()
	{
		
		return webdriver.findElement(By.id("user_email"));
		
	}
	public WebElement PassWord()
	{
		
		return webdriver.findElement(By.id("user_password"));
	}
	
	public WebElement SignIn()
	{
		
		return webdriver.findElement(By.className("btn-primary"));
		
	}


	
		
	
}

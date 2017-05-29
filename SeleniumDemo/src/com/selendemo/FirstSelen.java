package com.selendemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FirstSelen {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://enterprise.github.com/login");
		LoginPageActions lp=new LoginPageActions(driver);
		lp.typeUsername();
		Thread.sleep(2000);
		lp.typePassword();
		Thread.sleep(2000);
		lp.clickSignin();
		Actions ac=new Actions(driver);
		ac.keyDown(Keys.ALT);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		
		driver.close();
		
	}

}

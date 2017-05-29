package com.selendemo;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class SeleniumMur
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://iconnect.fs.capgemini.com/");

String txt = driver.findElement(By.cssSelector("span.TDLabelsValue")).getText();
String txt1 = driver.findElement(By.xpath("//*[@id='ctl00_cphMainContent_lblSupervisor']")).getText();
System.out.println("name: " + txt);
System.out.println("Supervisor:" + txt1);
driver.close();

}

}